package park;

import java.util.List;
import java.util.ArrayList;

public class ParkingLot {
    List<String> allowedNumberPlates;
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
        boolean flag;
        if (allowedNumberPlates.contains(vehicle.returnNumberPlates())) {
            flag = true;
        }else{
            flag = false;
        }
        return flag;
    }

    public boolean checkIfVehicleParked(Vehicle vehicle) {
        boolean flag;
        if (parkedVehicles.contains(vehicle)) {
            flag = true;
        }else {
            flag = false;
        }
        return flag;
    }

    public boolean parkVehicle(Vehicle vehicle) throws VehicleNotAllowedException, VehicleParkedException  {
        if (checkIfVehicleAllowed(vehicle)) {
            if(!checkIfVehicleParked(vehicle)){
                parkedVehicles.add(vehicle);
                return true;
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
