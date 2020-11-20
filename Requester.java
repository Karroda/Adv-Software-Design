import java.util.Date;


/**
 * @author zheng_zz
 */
public class Requester extends User {
    private static volatile RequestInfo requestInfo;
    private static volatile Feedback feedback;

    public Requester(Integer id, String name, String phone, String password){
        super(id,name,phone,password);
    }

    /**
     * Requester create new request
     * @param requesterId
     * @param content
     * @param location
     * @param price
     * @return
     */
    public static RequestInfo CreateNewRequestInfo(Integer requesterId, String content, String location, Double price){
        if (requestInfo == null){
            synchronized (RequestInfo.class){
                if (requestInfo == null){
                    requestInfo = new RequestInfo(requesterId,content,location,price);
                }
            }
        }
        return requestInfo;
    }

    /**
     * Requester pay for payment
     * @param requesterPayment
     */
    public static void payRequesterPayment(RequesterPayment requesterPayment){
        System.out.println(requesterPayment);
        System.out.println("Requester pay the payment");
    }

    /**
     * Requester create feedback
     * @param requestInfoId
     * @param category
     * @param score
     * @param content
     * @param time
     * @param abuseInfo
     * @return feedback
     */
    public static Feedback createFeedback(Integer requestInfoId, String category, Double score, String content,
                                          Date time, String abuseInfo){
        if (feedback == null){
            synchronized (Feedback.class){
                if (feedback == null){
                    feedback = new Feedback(requestInfoId, category, score, content, time, abuseInfo);
                }
            }
        }
        return feedback;
    }

    @Override
    public String toString() {
        return "Requester{" +
                "id=" + this.getId() +
                ", name='" + this.getName() + '\'' +
                ", phone='" + this.getPhone() + '\'' +
                ", password='" + this.getPassword() + '\'' +
                '}';
    }

    public static void main(String[] args) {
        RequestInfo temp = CreateNewRequestInfo(1,"content","location",1.2);
        System.out.println(temp);

        Feedback feedback = createFeedback(1,"cate",1.2,"content",new Date(),"abuse");
        System.out.println(feedback);

    }



}