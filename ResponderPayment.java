
import java.util.Date;

/**
 * @author zheng_zz
 * 
 * Modified by Shaolun
 */
public class ResponderPayment extends Payment{

    public ResponderPayment(Integer requestInfoId, Integer responderId, Date time, Double price, Double perUseFee) {
        super(requestInfoId, responderId, time, price, perUseFee);
    }

    public ResponderPayment(Integer id, Integer requestInfoId, Integer responderId, Date time, Double price, Double perUseFee) {
        super(id, requestInfoId, responderId, time, price, perUseFee);
    }

    @Override
    public String toString() {
        return "ResponderPayment{" +
                "id=" + id +
                ", requestInfoId=" + requestInfoId +
                ", responderId=" + userId +
                ", time=" + time +
                ", price=" + price +
                ", perUseFee=" + perUseFee +
                '}';
    }
}