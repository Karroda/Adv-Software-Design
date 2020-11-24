
/*
 * DB Manager as a singleton class for Requester
 * Shaolun
 */
public final class RequesterDBManager{
    private static volatile RequesterDBManager instance;

    private RequesterDBManager(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized(RequesterDBManager.class){
                if(instance == null){
                    instance = new RequesterDBManager();
                }
            }
        }
        return instance;
    }

    public boolean insert(){
        return true;
    }
}