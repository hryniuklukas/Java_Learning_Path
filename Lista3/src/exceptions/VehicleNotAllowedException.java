package exceptions;

import park.Vehicle;

public class VehicleNotAllowedException extends RuntimeException{
    final String numberPlates;
    public VehicleNotAllowedException(Vehicle vehicle)
    {
        this.numberPlates = vehicle.returnNumberPlates();
    }
    @Override
    public String getMessage()
    {
        return "Vehicle " + numberPlates + " not allowed to enter";
    }
}
