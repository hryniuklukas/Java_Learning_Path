package streamTask;

import java.util.*;


public class Target {
    String type;
    int someId;
    List<String> identifiers;

    public Target(String type, int someId) {
        this.type = type;
        this.someId = someId;
        identifiers = new ArrayList<>();
    }

    public Target(String type, int someId, List<String> identifiers) {
        this.type = type;
        this.someId = someId;
        this.identifiers = identifiers;
    }

    public void addIdentifier(String identifier) {
        this.identifiers.add(identifier);
    }

    public String idToString() {
        StringBuilder result = new StringBuilder();
        for (String s : identifiers
        ) {
            result.append(s).append(", ");
        }
        return result.toString();
    }

    public String toString() {
        return "Target [type: " + type + ", someId: " + someId + ", identifier: " + idToString() + "] \n";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Target target = (Target) o;

        if (someId != target.someId) return false;
        if (!type.equals(target.type)) return false;
        return identifiers.equals(target.identifiers);
    }

    @Override
    public int hashCode() {
        int result = type.hashCode();
        result = 31 * result + someId;
        result = 31 * result + identifiers.hashCode();
        return result;
    }
}
