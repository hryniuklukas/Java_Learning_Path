package exceptions;

import park.Vehicle;

public class VehicleParkedException extends  RuntimeException{
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
