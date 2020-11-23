
/**
 * @author Jiecong YANG
 */
public class Preference {
    private Integer requesterID;
    private Integer responderID;
    private Integer gender;
    private Integer age;
    private Integer workingAge;
    private String otherSpecificPrefence;
    
    /**
     * initialize Preference
     * @param requesterID
     * @param responderID
     * @param gender
     * @param age
     * @param workingAge
     */
    public Preference(Integer requesterID,Integer responderID,Integer gender,Integer age,Integer workingAge, String otherSpecificPrefence)
    {
        this.requesterID=requesterID;
        this.responderID=responderID;
        this.gender=gender;
        this.age=age;
        this.workingAge=workingAge;
        this.otherSpecificPrefence=otherSpecificPrefence;
    }

}
