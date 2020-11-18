import java.util.Date;
/**
 * @author zheng_zz
 */
public class Feedback {

    private Integer id;
    private Integer requestInfoId;
    private String category;
    private Double score;
    private String content;
    private Date time;
    private String abuseInfo;

    public Feedback(Integer requestInfoId, String category, Double score, String content, Date time, String abuseInfo) {
        this.requestInfoId = requestInfoId;
        this.category = category;
        this.score = score;
        this.content = content;
        this.time = time;
        this.abuseInfo = abuseInfo;
    }

    public Feedback(Integer id, Integer requestInfoId, String category, Double score, String content,
                    Date time, String abuseInfo) {
        this.id = id;
        this.requestInfoId = requestInfoId;
        this.category = category;
        this.score = score;
        this.content = content;
        this.time = time;
        this.abuseInfo = abuseInfo;
    }

    public Integer getRequestInfoId() {
        return requestInfoId;
    }

    public void setRequestInfoId(Integer requetInfoId) {
        this.requestInfoId = requetInfoId;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getAbuseInfo() {
        return abuseInfo;
    }

    public void setAbuseInfo(String abuseInfo) {
        this.abuseInfo = abuseInfo;
    }

    /**
     * Report abuse info
     * It should be send to Match System and save to DB
     * but this is a simple example
     * @param abuseInfo
     */
    public void reportAbuseInfo(String abuseInfo){
        System.out.println(abuseInfo);
    }

    @Override
    public String toString() {
        return "Feedback{" +
                "id=" + id +
                ", requestInfoId=" + requestInfoId +
                ", category='" + category + '\'' +
                ", score=" + score +
                ", content='" + content + '\'' +
                ", time=" + time +
                ", abuseInfo='" + abuseInfo + '\'' +
                '}';
    }
}