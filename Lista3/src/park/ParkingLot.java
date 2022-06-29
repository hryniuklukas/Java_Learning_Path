package park;

import java.util.List;
import java.util.ArrayList;

public class ParkingLot {
    List<String> allowedNumberPlates; // to Set
    List<Vehicle> parkedVehicles;

    public ParkingLot() {
        allowedNumberPlates = new ArrayList<>();
        parkedVehicles = new ArrayList<>();
    }

    public void addAllowedNumberPlate(String numberPlate) throws NumberPlatesAlreadyAllowedException {
        if(allowedNumberPlates.contains(numberPlate))
        {
            throw new NumberPlatesAlreadyAllowedException(numberPlate);
        }else
        {
            allowedNumberPlates.add(numberPlate);
        }
    }

    public boolean checkIfVehicleAllowed(Vehicle vehicle) {

        return allowedNumberPlates.contains(vehicle.returnNumberPlates());

    }

    public boolean checkIfVehicleParked(Vehicle vehicle) { //naming scheme -> isParked
        return parkedVehicles.contains(vehicle);
    }

    public void parkVehicle(Vehicle vehicle) throws VehicleNotAllowedException, VehicleParkedException  { //without throws (checked/unchecked exceptions)
        if (checkIfVehicleAllowed(vehicle)) {
            if(!checkIfVehicleParked(vehicle)){
                parkedVehicles.add(vehicle);
            }else{
                throw new VehicleParkedException(vehicle);
            }
        }else{
            throw new VehicleNotAllowedException(vehicle);
        }
    }
    public void releaseVehicle(Vehicle vehicle) throws VehicleAbsentException {
        if(checkIfVehicleParked(vehicle))
        {
            parkedVehicles.remove(vehicle);
        }else
        {
            throw new VehicleAbsentException(vehicle);
        }

    }
}
