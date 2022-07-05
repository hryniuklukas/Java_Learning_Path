package streamTask;

public class Source {
    String type;
    int someId;
    String identifier;

    public Source(String type, int someId, String identifier)
    {
        this.type = type;
        this.someId = someId;
        this.identifier = identifier;
    }
    public String getType()
    {
        return type;
    }
    public int getSomeId()
    {
        return someId;
    }
    public String getIdentifier()
    {
        return identifier;
    }
    public String toString()
    {
        return "Source [type: " + type + ", someId: " + someId + ", identifier: " + identifier + "] \n";
    }
    public String getTypeAndSomeId()
    {
        return type+someId;
    }
}
