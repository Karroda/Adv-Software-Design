
/*
 * DB Manager as a singleton class for Requester
 * Shaolun
 */
public final class RequesterDBManager{
    private static volatile RequesterDBManager instance;

    private RequesterDBManager(){}

    public static RequesterDBManager getInstance(){
        if(instance == null){
            synchronized(RequesterDBManager.class){
                if(instance == null){
                    instance = new RequesterDBManager();
                }
            }
        }
        return instance;
    }

    public boolean insert(RequestInfo record){
        if(instance == null)
            return false;

        // insert the record to db
        return true;
    }

    /*
     * search the RequestInfo according to id
     * could overload with other parameters
     */
    public RequestInfo search(Integer id){
        // search in db with ID=id, 4 lines below are placeholders
        Integer requesterId = 10;
        String content = "content";
        String location = "location";
        Double price = 10;
        
        return new RequestInfo(id, requesterId, content, location, price);
    } 
}