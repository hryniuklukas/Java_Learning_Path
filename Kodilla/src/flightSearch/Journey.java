package flightSearch;

public class Journey {
    Flight first;
    Flight second;
    public Journey(Flight first, Flight second)
    {
        this.first = first;
        this.second = second;
    }
    public Journey(Flight first)
    {
        this.first = first;
    }
    public String toString()
    {
        if(this.second == null)
        {
            return "Flight from " + first.departure + " to " + first.arrival + ".";
        }else
        {
            return "Flight from " + first.departure + " to " + second.arrival + " with stop at " + first.arrival + ".";
        }
    }
}
