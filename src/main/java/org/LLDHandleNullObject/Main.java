package org.LLDHandleNullObject;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle= VehicleFactory.getVehicleObject("Car");
        printVehicleDetails(vehicle);
    }
    public static void printVehicleDetails(Vehicle vehicle){
        System.out.println(" tank capacity: "+ vehicle.getTankCapacity());
        System.out.println(" seat capacity: "+ vehicle.getSeatingCapacity());

    }
}
