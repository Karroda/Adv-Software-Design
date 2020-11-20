import java.util.Date;

/**
 * @author zheng_zz
 */
public class RequestInfo {

    private static volatile RequesterPayment requesterPayment;


    private Integer id;
    private Integer requesterId;
    private Integer [] responderId;
    private String content;
    private Integer workingIntensity;
    private Date time;
    private Integer feedbackId;
    private String location;
    private Double price;
    private Integer requiredNumberOfPeople;
    private String requiredTool;
    private String requiredSkill;

    public RequestInfo(Integer requesterId, String content, String location, Double price) {
        this.requesterId = requesterId;
        this.content = content;
        this.location = location;
        this.price = price;
    }

    public RequestInfo(Integer[] responderId, String content, String location, Double price) {
        this.responderId = responderId;
        this.content = content;
        this.location = location;
        this.price = price;
    }

    public RequestInfo(Integer id, Integer requesterId, Integer[] responderId, String content, Integer workingIntensity,
                       Date time, Integer feedbackId, String location, Double price, Integer requiredNumberOfPeople,
                       String requiredTool, String requiredSkill) {
        this.id = id;
        this.requesterId = requesterId;
        this.responderId = responderId;
        this.content = content;
        this.workingIntensity = workingIntensity;
        this.time = time;
        this.feedbackId = feedbackId;
        this.location = location;
        this.price = price;
        this.requiredNumberOfPeople = requiredNumberOfPeople;
        this.requiredTool = requiredTool;
        this.requiredSkill = requiredSkill;
    }

    /**
     * Create requesterPayment by using some info from RequestInfo
     * @param requestInfoId
     * @param requesterId
     * @param time
     * @param price
     * @param perUseFee
     * @return
     */
    public static RequesterPayment createRequesterPayment(Integer requestInfoId, Integer requesterId, Date time,
                                                          Double price, Double perUseFee){
        if (requesterPayment == null){
            synchronized (RequesterPayment.class){
                if (requesterPayment == null){
                    requesterPayment = new RequesterPayment(requestInfoId,requesterId,time,price,perUseFee);
                }
            }
        }
        return requesterPayment;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "RequestInfo{" +
                "id=" + id +
                ", requesterId=" + requesterId +
                ", responderId=" + java.util.Arrays.toString(responderId) +
                ", content='" + content + '\'' +
                ", location='" + location + '\'' +
                ", price=" + price +
                '}';
    }

    /**
     * Show feedback by requestInfoId
     * @param id
     */
    public void showFeedbackById(Integer id){
        System.out.println("select from db by requestInfo id");
    }


    public static void main(String[] args) {
        RequesterPayment requesterPayment = createRequesterPayment(1,1,new Date(),1.2,0.1);
        System.out.println(requesterPayment);
    }
}