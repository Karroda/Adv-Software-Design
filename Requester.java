import java.util.Date;

/**
 * @author zheng_zz
 */ 
public class Requester extends User {
    private static volatile RequestInfo requestInfo;
    private static volatile Feedback feedback;
    private Preference preference;

    public Requester(Integer id, String name, String phone, String password){
        super(id,name,phone,password);
    }

    public static RequestInfo getRequestInfo() {
        return requestInfo;
    }

    public static void setRequestInfo(RequestInfo requestInfo) {
        Requester.requestInfo = requestInfo;
    }

    public static Feedback getFeedback() {
        return feedback;
    }

    public static void setFeedback(Feedback feedback) {
        Requester.feedback = feedback;
    }

    public Preference getPreference() {
        return this.preference;
    }

    public void setPreference(Preference preference) {
        this.preference = preference;
    }

    /**
     * Create preferences
     * @param requesterID
     * @param responderID
     * @param gender
     * @param age
     * @param workingAge
     * @return
     */
    public Preference createPreferences(Integer requesterID,Integer responderID,Integer gender,
                                                Integer age,Integer workingAge){
        return preference = new Preference(requesterID,responderID,gender,age,workingAge);
    }

    /**
     * Get requester by id
     * @param requesterId
     * @return
     */
    public static Requester getRequesterById(Integer requesterId){
        System.out.println("select from db to find requester where id = requesterId");
        Requester requester = new Requester(1,"name","phone","password");
        return requester;
    }

    /**
     * Requester create new request
     * @param requesterId
     * @param content
     * @param location
     * @param price
     * @return
     */
    public static RequestInfo createNewRequestInfo(Integer id, Integer requesterId, String content, String location, Double price){
        if (requestInfo == null){
            synchronized (RequestInfo.class){
                if (requestInfo == null){
                    requestInfo = new RequestInfo(id,requesterId,content,location,price);
                }
            }
        }
        return requestInfo;
    }

    /**
     * Requester pay for payment
     * @param requestInfoId
     */
    public static void payRequesterPayment(Integer requestInfoId,Integer requesterId,Double price,Double perUseFee){
        RequesterPayment requesterPayment = RequestInfo.createRequesterPayment(requestInfoId,requesterId,
                                        new Date(),price,perUseFee);
        System.out.println("pay for requesterPayment");
        System.out.println(requesterPayment);
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
    public static Feedback createFeedback(Integer id, Integer requestInfoId, String category, Double score, String content,
                                          Date time, String abuseInfo){
        if (feedback == null){
            synchronized (Feedback.class){
                if (feedback == null){
                    feedback = new Feedback(id, requestInfoId, category, score, content, time, abuseInfo);
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
        RequestInfo temp = createNewRequestInfo(1,1,"content","location",1.2);
        System.out.println(temp);

        Feedback feedback = createFeedback(1,1,"cate",1.2,"content",new Date(),"abuse");
        System.out.println(feedback);

    }



}