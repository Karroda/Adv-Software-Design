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
     * getFeedBack
     * The Feedback should be returned by searching DB and get a corresponding object
     * create a new instance of Feedback in this example to show the return type is Feedback
     * @param requestInfoId
     * @return
     */
    public static Feedback getFeedBack(Integer requestInfoId){
        System.out.println("select from db to find which feedback has the same requestInfoId");
        return new Feedback(requestInfoId, "category", 4.0 , "content",
                new Date(), "abuseInfo");
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

        Feedback feedback = getFeedBack(1);
        System.out.println(feedback);

        ResponderPayment responderPayment = getResponderPayment(1,2);
        System.out.println(responderPayment);
    }

}