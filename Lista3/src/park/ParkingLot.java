package park;

import exceptions.NumberPlatesAlreadyAllowedException;
import exceptions.VehicleAbsentException;
import exceptions.VehicleNotAllowedException;
import exceptions.VehicleParkedException;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.ArrayList;

public class ParkingLot {
    Set<String> allowedNumberPlates; // to Set
    List<Vehicle> parkedVehicles;

    public ParkingLot() {
        allowedNumberPlates = new HashSet<>();
        parkedVehicles = new ArrayList<>();
    }

    public void addAllowedNumberPlate(String numberPlate) {
        if (allowedNumberPlates.contains(numberPlate)) {
            throw new NumberPlatesAlreadyAllowedException(numberPlate);
        }
        allowedNumberPlates.add(numberPlate);
    }

    public boolean isAllowed(Vehicle vehicle) {

        return allowedNumberPlates.contains(vehicle.returnNumberPlates());

    }

    public boolean isParked(Vehicle vehicle) { //naming scheme -> isParked
        return parkedVehicles.contains(vehicle);
    }

    public void parkVehicle(Vehicle vehicle) {
        if (isAllowed(vehicle)) {
            if (!isParked(vehicle)) {
                parkedVehicles.add(vehicle);
            } else {
                throw new VehicleParkedException(vehicle);
            }
        } else {
            throw new VehicleNotAllowedException(vehicle);
        }
    }

    public void releaseVehicle(Vehicle vehicle) {
        if (isParked(vehicle)) {
            parkedVehicles.remove(vehicle);
        } else {
            throw new VehicleAbsentException(vehicle);
        }

    }
}
