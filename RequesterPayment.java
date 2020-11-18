
import java.util.Date;

/**
 * @author zheng_zz
 */
public class RequesterPayment {

    private Integer id;
    private Integer requestInfoId;
    private Integer requesterId;
    private Date time;
    private Double price;
    private Double perUseFee;

    public RequesterPayment(Integer requestInfoId, Integer requesterId, Date time, Double price, Double perUseFee) {
        this.requestInfoId = requestInfoId;
        this.requesterId = requesterId;
        this.time = time;
        this.price = price;
        this.perUseFee = perUseFee;
    }

    public RequesterPayment(Integer id, Integer requestInfoId, Integer requesterId, Date time, Double price, Double perUseFee) {
        this.id = id;
        this.requestInfoId = requestInfoId;
        this.requesterId = requesterId;
        this.time = time;
        this.price = price;
        this.perUseFee = perUseFee;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getRequestInfoId() {
        return requestInfoId;
    }

    public void setRequestInfoId(Integer requestInfoId) {
        this.requestInfoId = requestInfoId;
    }

    public Integer getRequesterId() {
        return requesterId;
    }

    public void setRequesterId(Integer requesterId) {
        this.requesterId = requesterId;
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
        return "RequesterPayment{" +
                "id=" + id +
                ", requestInfoId=" + requestInfoId +
                ", requesterId=" + requesterId +
                ", time=" + time +
                ", price=" + price +
                ", perUseFee=" + perUseFee +
                '}';
    }
}