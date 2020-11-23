import java.util.Date;
/**
 * @author Jiecong YANG
 */
public class occupiedInfo {
    private Integer responderID;
    private Boolean isOccupied;
    private Date OccupiedTime;

    public Integer getResponderID()
    {
        return this.responderID;
    }

    public Boolean getIsOccupied()
    {
        return this.isOccupied;
    }

    public Date getOccupiedTime()
    {
        return this.OccupiedTime;
    }
}
