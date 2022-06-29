package park;

public class NumberPlatesAlreadyAllowedException extends Exception{
    final String numberPlates;
    public NumberPlatesAlreadyAllowedException(String numberPlates)
    {
        this.numberPlates = numberPlates;
    }
    @Override
    public String getMessage()
    {
        return "Vehicle " + numberPlates + " already on allowed list";
    }
}
