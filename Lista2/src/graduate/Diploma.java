package graduate;
import java.time.LocalDate;

public abstract class Diploma {
    public static final String RECOGNITION = "Recognition";
    public static final String ENGINEERING = "Engineering";
    Graduate owner;
    int diplomaId;
    LocalDate issueDate;

    String type;

    protected Diploma(Graduate owner, int diplomaId, LocalDate issueDate)
    {
        this.owner = owner;
        this.diplomaId = diplomaId;
        this.issueDate = issueDate;
    }
    public String getOwner()
    {
        return owner.name;
    }
    public int getDiplomaId()
    {
        return diplomaId;
    }
    public String getType()
    {
        return type;
    }
    public String toString()
    {
        return getDiplomaId() + ". " + getType() + " " + getOwner();
    }
}
