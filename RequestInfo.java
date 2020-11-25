import java.util.Date;

/**
 * @author zheng_zz
 */
public class RequestInfo {

    private static volatile RequesterPayment requesterPayment;

    private static RequesterDBManager dbManager = RequesterDBManager.getInstance();

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

    public RequestInfo(Integer id, Integer requesterId, String content, String location, Double price) {
        this.requesterId = requesterId;
        this.content = content;
        this.location = location;
        this.price = price;

        dbManager.insert(this);
    }

    public RequestInfo(Integer[] responderId, String content,String location, Double price) {
        this.responderId = responderId;
        this.content = content;
        this.location = location;
        this.price = price;

        dbManager.insert(this);
    }

    public RequestInfo(Integer id, Integer requesterId, Integer []responderId, String content, String location, Double price) {
        this.requesterId = requesterId;
        this.responderId = responderId;
        this.content = content;
        this.location = location;
        this.price = price;

        dbManager.insert(this);
    }

    public RequestInfo(Integer id, Integer requesterId, Integer []responderId, String content,
                       Integer feedbackId, String location, Double price) {
        this.requesterId = requesterId;
        this.responderId = responderId;
        this.content = content;
        this.location = location;
        this.price = price;

        dbManager.insert(this);
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

        dbManager.insert(this);
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

    public static RequesterPayment getRequesterPayment() {
        return requesterPayment;
    }

    public static void setRequesterPayment(RequesterPayment requesterPayment) {
        RequestInfo.requesterPayment = requesterPayment;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Integer requesterId) {
        this.requesterId = requesterId;
    }

    public Integer[] getResponderId() {
        return responderId;
    }

    public void setResponderId(Integer[] responderId) {
        this.responderId = responderId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getWorkingIntensity() {
        return workingIntensity;
    }

    public void setWorkingIntensity(Integer workingIntensity) {
        this.workingIntensity = workingIntensity;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getFeedbackId() {
        return feedbackId;
    }

    public void setFeedbackId(Integer feedbackId) {
        this.feedbackId = feedbackId;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getRequiredNumberOfPeople() {
        return requiredNumberOfPeople;
    }

    public void setRequiredNumberOfPeople(Integer requiredNumberOfPeople) {
        this.requiredNumberOfPeople = requiredNumberOfPeople;
    }

    public String getRequiredTool() {
        return requiredTool;
    }

    public void setRequiredTool(String requiredTool) {
        this.requiredTool = requiredTool;
    }

    public String getRequiredSkill() {
        return requiredSkill;
    }

    public void setRequiredSkill(String requiredSkill) {
        this.requiredSkill = requiredSkill;
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
     * @param requesterId
     */
    public void showFeedbackById(Integer requesterId){
        Feedback feedback = Feedback.getFeedbackById(requesterId);
        System.out.println(feedback);
    }

    /**
     * Get RequestInfo by requestInfoId
     * @param requesterInfoId
     * @return
     */
    public static RequestInfo getRequestInfoById(Integer requesterInfoId){
        System.out.println("select from db to return object RequestInfo where id = requesterInfoId");
        Integer [] responderId = {1};
        RequestInfo requestInfo = new RequestInfo(requesterInfoId,1,responderId,"content",
                "location",1.1);
        return requestInfo;
    }

    /**
     * Get RequestInfo by requestInfoId
     * @param requesterInfoId
     * @return
     */
    public static RequestInfo getRequestInfoByIdWithFeedbackId(Integer requesterInfoId){
        System.out.println("select from db to return object RequestInfo where id = requesterInfoId");
        Integer [] responderId = {1};
        RequestInfo requestInfo = new RequestInfo(requesterInfoId,1,responderId,"content",
                1,"location",1.1);
        return requestInfo;
    }

    /**
     * Get RequestInfo by requestInfoId
     * @param requesterInfoId
     * @return
     */
    public static RequestInfo getRequestInfoByIdWithoutResponders(Integer requesterInfoId){
        System.out.println("select from db to return object RequestInfo where id = requesterInfoId");
        Integer [] responderId = {1};
        RequestInfo requestInfo = new RequestInfo(requesterInfoId,1,"content",
                "location",1.1);
        return requestInfo;
    }




    public static void main(String[] args) {
        RequesterPayment requesterPayment = createRequesterPayment(1,1,
                new Date(),1.2,0.1);
        System.out.println(requesterPayment);

        RequestInfo requestInfo = getRequestInfoById(1);
        System.out.println(requestInfo);
    }
}