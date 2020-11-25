import java.util.Date;
/**
 * @author Jiecong YANG
 */
public class OccupiedInfo {
    private Integer responderID;
    private Boolean isOccupied;
    private Date occupiedTime;

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
        return this.occupiedTime;
    }
}
