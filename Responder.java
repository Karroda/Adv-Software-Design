import java.util.Date;


/**
 * @author zheng_zz
 */
public class Responder extends User {

    public Responder(Integer id, String name, String phone, String password){
        super(id,name,phone,password);
    }

    /**
     * receiveNewRequestInfo
     * The RequestInfo should be returned by searching DB and get a corresponding object
     * create instances of RequestInfo in this example to show the return type is list of RequestInfo
     * @param responderId
     * @return
     */
    public static RequestInfo [] receiveNewRequestInfo(Integer []responderId){
        System.out.println("select from db to find those requestInfo have the same responderId");

        RequestInfo a = new RequestInfo(responderId, "content1", "location1", 1.0);
        RequestInfo b = new RequestInfo(responderId, "content2", "location2", 2.0);
        RequestInfo c = new RequestInfo(responderId, "content3", "location3", 3.0);

        RequestInfo [] requestInfos = {a,b,c};
        return requestInfos;
    }

    /**
     * receiveNewRequestInfo
     * @param requestInfoId
     * @return
     */
    public RequestInfo receiveNewRequestInfo(Integer requestInfoId){
        RequestInfo requestInfo = RequestInfo.getRequestInfoByIdWithoutResponders(requestInfoId);
        Integer [] responderId = {1};
        requestInfo.setResponderId(responderId);
        return requestInfo;
    }



    /**
     * getFeedBack
     * The Feedback should be returned by searching DB and get a corresponding object
     * create a new instance of Feedback in this example to show the return type is Feedback
     * @param requestInfoId
     * @return
     */
    public Feedback getFeedBack(Integer requestInfoId){
        RequestInfo requestInfo = RequestInfo.getRequestInfoByIdWithFeedbackId(requestInfoId);
        Integer feedbackId = requestInfo.getFeedbackId();
        Feedback feedback = Feedback.getFeedbackById(feedbackId);
        return feedback;
    }

    /**
     * Show feedback after getFeedback
     * @param feedback
     */
    public void showFeedback(Feedback feedback){
        System.out.println(feedback);
    }

    /**
     * Show requestInfo
     * @param requestInfo
     */
    public void showRequestInfo(RequestInfo requestInfo){
        System.out.println(requestInfo);
    }

    /**
     * Show responderPayment
     */
    public void showResponderPayment(ResponderPayment responderPayment){
        System.out.println(responderPayment);
    }

    /**
     * getResponderPayment
     * The ResponderPayment should be returned by searching DB and get a corresponding object
     * create a new instance of ResponderPayment in this example to show the return type is ResponderPayment
     * @param requestInfoId
     * @param responderId
     * @return
     */
    public static ResponderPayment getResponderPayment(Integer requestInfoId, Integer responderId){
        System.out.println("select from db to find which responder payment has the same requestInfoId and responderId");
        return new ResponderPayment(requestInfoId,responderId,new Date(),1.0,0.1);
    }

    /**
     * Get responder by responderId
     * @param responderId
     */
    public static Responder getResponderById(Integer responderId){

        System.out.println("select from the db to find responder where id = "+responderId);
        Responder responder = new Responder(1,"name","phone","password");
        return responder;
    }


    @Override
    public String toString() {
        return "Responder{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", phone='" + this.getPhone() + '\'' +
                ", password='" + this.getPassword() + '\'' +
                '}';
    }

    public static void main(String[] args) {

        Integer [] responderIds = {1,2};
        RequestInfo [] requestInfos = receiveNewRequestInfo(responderIds);
        for (RequestInfo temp: requestInfos) {
            System.out.println(temp);
        }

        ResponderPayment responderPayment = getResponderPayment(1,2);
        System.out.println(responderPayment);

    }

}