package model;

import park.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Vehicle car1 = new Car("DW788S5");
        Vehicle car2 = new Car("SK120MS");
        Vehicle bike1 = new Motorcycle("WE21876");
        Vehicle bike2 = new Motorcycle("DWR1084");

        ParkingLot carpark1 = new ParkingLot();

        try {
            carpark1.addAllowedNumberPlate(car1.returnNumberPlates());
            carpark1.addAllowedNumberPlate(car2.returnNumberPlates());
            carpark1.addAllowedNumberPlate(bike1.returnNumberPlates());
            carpark1.addAllowedNumberPlate(bike1.returnNumberPlates());
        } catch (NumberPlatesAlreadyAllowedException e) {
            System.out.println(e.getMessage());
        }
        try {
            carpark1.parkVehicle(car1);
            System.out.println("Vehicle " + car1.returnNumberPlates() + " parked correctly");
        } catch (VehicleParkedException | VehicleNotAllowedException e) {
            System.out.println(e.getMessage());
        }
        try {
            carpark1.parkVehicle(car1);
            System.out.println("Vehicle " + car1.returnNumberPlates() + " parked correctly");
        } catch (VehicleParkedException | VehicleNotAllowedException e) {
            System.out.println(e.getMessage());
        }
        try {
            carpark1.releaseVehicle(bike2);
        } catch (VehicleAbsentException e) {
            System.out.println(e.getMessage());
        }


    }

}