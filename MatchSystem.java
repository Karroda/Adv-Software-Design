import java.util.Date;
/**
 * @author Jiecong YANG, zheng_zz
 * mediator pattern, reducing the coupling between requester and responder
 */
public class MatchSystem {

    private RequesterPayment [] requesterPayment;
    private RequestInfo [] requestInfo;
    private Feedback [] feedbacks;
    private Preference [] preferences;
    private OccupiedInfo [] occupiedInfos;
    /**
     * search reqeuster's preference
     * @param requesterID
     * @return
     */
    public Preference searchPreference(Integer requesterID)
    {
        for(int i=0;i<preferences.length;i++)
            if(this.preferences[i].getRequesterID()==requesterID)
                return this.preferences[i];
        return null;
    }

    /**
     * search responder's occupied info
     * @param responderID
     * @return
     */
    public OccupiedInfo searchOccupiedInfo(Integer responderID)
    {
        for(int i=0;i<occupiedInfos.length;i++)
            if(this.occupiedInfos[i].getResponderID()==responderID)
                return this.occupiedInfos[i];
        return null;
    }


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


    /**
     * Match feedback to corresponding Responder
     * @param feedback
     * @return
     */
    public static Integer [] feedbackMatchResponder(Feedback feedback){

        Integer requestInfoId = feedback.getRequestInfoId();
        RequestInfo requestInfo = RequestInfo.getRequestInfoById(requestInfoId);
        Integer [] responderId = requestInfo.getResponderId();
        return responderId;
    }

    /**
     * Use preference to match suitable responders
     * @param preference
     * @return
     */
    public static Integer [] preferenceMatchResponder(Preference preference){
        Integer [] responderId = {1};
        return responderId;
    }

    /**
     * Match requestInfo to Responder
     * @param requestInfo
     * @return
     */
    public static Integer [] requestInfoMatchResponder(RequestInfo requestInfo){
        Integer requesterId = requestInfo.getRequesterId();
        Requester requester = Requester.getRequesterById(requesterId);
        Preference preference = requester.getPreference();
        return preferenceMatchResponder(preference);
    }

    /**
     * Match responderPayment to responder
     * @return
     */
    public static Integer [] responderPaymentMatchResponder(RequesterPayment requesterPayment){
        Integer requestInfoId = requesterPayment.getRequestInfoId();
        RequestInfo requestInfo = RequestInfo.getRequestInfoById(requestInfoId);
        Integer [] responder = requestInfo.getResponderId();
        return responder;
    }

    /**
     * Stimulate transferring requestInfo, responder payment, feedback
     * @param args
     */
    public static void main(String[] args) {

        MatchSystem matchSystem = new MatchSystem();

        // requestInfo
        RequestInfo [] requestInfo = {Requester.createNewRequestInfo(1,1,"content",
                "location",1.1)};
        matchSystem.getRequestInfos(requestInfo);
        for (RequestInfo reqInfo: requestInfo){
            Integer [] responderId = requestInfoMatchResponder(reqInfo);
            for (Integer id: responderId){
                Responder responder = Responder.getResponderById(reqInfo.getId());
                RequestInfo temp = responder.receiveNewRequestInfo(id);
                responder.showRequestInfo(temp);
            }

        }
        System.out.println("============================");
        // feedback
        // 1. matchSystem get feedbacks sent by requester
        Feedback []feedbacks = {Requester.createFeedback(1,1,"cate",1.2,
                "content",new Date(),"abuse")};
        matchSystem.getFeedbacks(feedbacks);
        // 2. send feedbacks to responders and responder gets feedback
        for (Feedback feedback: feedbacks){
            Integer [] responderId = feedbackMatchResponder(feedback);
            for (Integer id: responderId){
                Responder responder = Responder.getResponderById(id);
                Feedback resFeedback = responder.getFeedBack(feedback.getRequestInfoId());
                responder.showFeedback(resFeedback);
            }
        }

        System.out.println("============================");
        // responderPayment
        RequesterPayment [] requesterPayments = {RequestInfo.createRequesterPayment(1,
                                        1,new Date(),1.2,0.1)};
        matchSystem.getRequestPayments(requesterPayments);
        for (RequesterPayment requesterPayment: requesterPayments) {
            Integer[] responderId = responderPaymentMatchResponder(requesterPayment);
            for (Integer id : responderId) {
                Responder responder = Responder.getResponderById(id);
                ResponderPayment responderPayment =
                        Responder.getResponderPayment(requesterPayment.getRequestInfoId(),id);
                responder.showResponderPayment(responderPayment);
            }
        }
    }
}
