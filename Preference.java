
/**
 * @author Jiecong YANG
 */
public class Preference {
    private Integer requesterID;
    private Integer responderID;
    private Integer gender;
    private Integer age;
    private Integer workingAge;
    
    /**
     * initialize Preference
     * @param requesterID
     * @param responderID
     * @param gender
     * @param age
     * @param workingAge
     */
    public Preference(Integer requesterID,Integer responderID,Integer gender,Integer age,Integer workingAge)
    {
        this.requesterID=requesterID;
        this.responderID=responderID;
        this.gender=gender;
        this.age=age;
        this.workingAge=workingAge;
    }

}
