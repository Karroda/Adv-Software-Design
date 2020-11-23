
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
     * @param otherSpecificPrefence
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
    
    public Integer getRequesterID()
    {
        return this.requesterID;
    }

    public Integer getResponderID()
    {
        return this.responderID;
    }

    public Integer getGender()
    {
        return this.gender;
    }

    public Integer getAge()
    {
        return this.age;
    }

    public Integer getWorkingAge()
    {
        return this.workingAge;
    }

    public String getOtherSpecificPrefence()
    {
        return this.otherSpecificPrefence;
    }

}
