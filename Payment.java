import java.util.Date;

/**
 * @author Shaolun
 */
public abstract class Payment{
    protected Integer id;
    protected Integer requestInfoId;
    protected Integer userId;
    protected Date time;
    protected Double price;
    protected Double perUseFee;

    public Payment(Integer requestInfoId, Integer userId, Date time, Double price, Double perUseFee) {
        this.requestInfoId = requestInfoId;
        this.userId = userId;
        this.time = time;
        this.price = price;
        this.perUseFee = perUseFee;
    }

    public Payment(Integer id, Integer requestInfoId, Integer responderId, Date time, Double price, Double perUseFee) {
        this.id = id;
        this.requestInfoId = requestInfoId;
        this.userId = responderId;
        this.time = time;
        this.price = price;
        this.perUseFee = perUseFee;
    }

    public Integer getRequestInfoId() {
        return requestInfoId;
    }

    public void setRequestInfoId(Integer requestInfoId) {
        this.requestInfoId = requestInfoId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getPerUseFee() {
        return perUseFee;
    }

    public void setPerUseFee(Double perUseFee) {
        this.perUseFee = perUseFee;
    }

    @Override
    public abstract String toString();
}