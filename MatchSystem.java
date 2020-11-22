import java.util.Date;
/**
 * @author Jiecong YANG
 */
public class MatchSystem {

    private RequesterPayment [] requesterPayment;
    private RequestInfo [] requestInfo;
    private Feedback [] feedbacks;
    /**
     * match system get request payments and save it
     * @param requesterPayment
     */
    public void getRequestPayments(RequesterPayment [] requesterPayment)
    {
        this.requesterPayment = requesterPayment;

    }

    /**
     * get the request infos
     * @param requestInfo
     */
    public void getRequestInfos(RequestInfo [] requestInfo)
    {
        this.requestInfo = requestInfo;
    }

    /**
     * send request info
     * @return
     */
    public RequestInfo [] sendRequestInfos()
    {
        return this.requestInfo;
    }

    /**
     * create responder payment
     * @param requestInfoId
     * @param responderId
     * @param time
     * @param price
     * @param perUseFee
     * @return
     */
    public ResponderPayment createResponderPayment(Integer requestInfoId, Integer responderId, Date time, Double price, Double perUseFee)
    {
        return new ResponderPayment(responderId, requestInfoId, responderId, time, price, perUseFee);
    }

    /**
     * get feedbacks
     * @param feedbacks
     */
    public void getFeedbacks(Feedback [] feedbacks)
    {
        this.feedbacks=feedbacks;
    }
}
