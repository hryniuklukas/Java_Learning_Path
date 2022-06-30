package exceptions;

import park.Vehicle;

public class VehicleAbsentException extends RuntimeException{
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
