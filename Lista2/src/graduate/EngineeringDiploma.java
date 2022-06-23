package graduate;

import java.time.LocalDate;

public class EngineeringDiploma extends Diploma{
    String specialty;

    public EngineeringDiploma(Graduate owner, int diplomaId, LocalDate issueDate, String specialty) {
        super(owner, diplomaId, issueDate);
        this.specialty = specialty;
        this.type = Diploma.ENGINEERING;
    }
    public String getSpecialty()
    {
        return specialty;
    }
    @Override
    public String toString()
    {
        return super.toString() +" "+ specialty;
    }
}
