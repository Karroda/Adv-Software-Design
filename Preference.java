
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

    public Integer getRequesterID() {
        return requesterID;
    }

    public void setRequesterID(Integer requesterID) {
        this.requesterID = requesterID;
    }

    public Integer getResponderID() {
        return responderID;
    }

    public void setResponderID(Integer responderID) {
        this.responderID = responderID;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getWorkingAge() {
        return workingAge;
    }

    public void setWorkingAge(Integer workingAge) {
        this.workingAge = workingAge;
    }
}
