package park;

public class VehicleParkedException extends  Exception{
    final String numberPlates;
    public VehicleParkedException(Vehicle vehicle)
    {
        this.numberPlates = vehicle.returnNumberPlates();
    }
    @Override
    public String getMessage()
    {
        return "Vehicle " + numberPlates + " already parked!";
    }
}
