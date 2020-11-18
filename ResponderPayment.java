
import java.util.Date;

/**
 * @author zheng_zz
 */
public class ResponderPayment {

    private Integer id;
    private Integer requestInfoId;
    private Integer responderId;
    private Date time;
    private Double price;
    private Double perUseFee;

    public ResponderPayment(Integer requestInfoId, Integer responderId, Date time, Double price, Double perUseFee) {
        this.requestInfoId = requestInfoId;
        this.responderId = responderId;
        this.time = time;
        this.price = price;
        this.perUseFee = perUseFee;
    }

    public ResponderPayment(Integer id, Integer requestInfoId, Integer responderId, Date time, Double price, Double perUseFee) {
        this.id = id;
        this.requestInfoId = requestInfoId;
        this.responderId = responderId;
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

    public Integer getResponderId() {
        return responderId;
    }

    public void setResponderId(Integer responderId) {
        this.responderId = responderId;
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
    public String toString() {
        return "ResponderPayment{" +
                "id=" + id +
                ", requestInfoId=" + requestInfoId +
                ", responderId=" + responderId +
                ", time=" + time +
                ", price=" + price +
                ", perUseFee=" + perUseFee +
                '}';
    }
}