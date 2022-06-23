package graduate;

import java.util.ArrayList;
import java.util.List;

public class DiplomaRegistry {
    ArrayList<Diploma> registry = new ArrayList<>();

    public void addDiploma(Diploma diploma)
    {
        registry.add(diploma);
    }
    public List<Diploma> getDiplomas(String type)
    {
        ArrayList<Diploma> result = new ArrayList<>();

        if(type.equals(Diploma.RECOGNITION))
        {
            for (Diploma diploma:registry) {
                if(diploma instanceof DiplomaOfRecognition)
                {
                    result.add(diploma);
                }
            }
            return result;
        }else
        {
            for (Diploma diploma:registry) {
                if(diploma instanceof EngineeringDiploma)
                {
                    result.add(diploma);
                }
            }
            return result;
        }
    }
    public List<Diploma> getDiplomas()
    {
        return registry;
    }
    public List<Diploma> getDiplomasByOwner(String ownerName)
    {
        ArrayList<Diploma> result = new ArrayList<>();
        for(Diploma diploma: registry)
        {
            if(diploma.getOwner().equals(ownerName))
            {
                result.add(diploma);
            }
        }
        return result;
    }
    public Graduate getOwnerOfDiploma(int id) {
        for (Diploma diploma : registry) {
            if (diploma.diplomaId == id) {
                return diploma.owner;
            }
        }
        return null;
    }
}
