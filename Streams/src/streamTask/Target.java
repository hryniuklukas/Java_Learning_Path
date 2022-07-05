package streamTask;

import java.util.*;


public class Target {
    String type;
    int someId;
    List<String> identifiers;
    public Target(String type, int someId)
    {
        this.type = type;
        this.someId = someId;
        identifiers = new ArrayList<>();
    }
    public void addIdentifier(String identifier)
    {
        this.identifiers.add(identifier);
    }
    public String idToString()
    {
        StringBuilder result = new StringBuilder();
        for (String s: identifiers
             ) {
            result.append(s).append(", ");
        }
        return result.toString();
    }
    public String toString()
    {
        return "Target [type: " + type + ", someId: " + someId + ", identifier: " + idToString() + "] \n";
    }

}
