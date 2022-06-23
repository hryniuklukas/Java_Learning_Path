package graduate;

import java.time.LocalDate;

public class DiplomaOfRecognition extends Diploma{
    String title;

    public DiplomaOfRecognition(Graduate owner, int diplomaId, LocalDate issueDate, String title) {
        super(owner, diplomaId, issueDate);
        this.title = title;
        this.type = Diploma.RECOGNITION;
    }
    public String getTitle()
    {
        return title;
    }
    @Override
    public String toString()
    {
        return super.toString() +" " + title;
    }
}
