package park;

public class VehicleAbsentException extends Exception{
    final String numberPlates;
    public VehicleAbsentException(Vehicle vehicle)
    {
        this.numberPlates = vehicle.returnNumberPlates();
    }
    @Override
    public String getMessage()
    {
        return "Vehicle " + numberPlates + " not found in Parking Lot";
    }
}
