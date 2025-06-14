package org.Practise.LLDParkingLot;

import org.Practise.LLDParkingLot.Vehicle.Vehicle;
import org.Practise.LLDParkingLot.Vehicle.VehicleType;

public class ParkingSpot {
    Vehicle vehicle;
    int spotNumber;
    boolean isAvailable;
    VehicleType vehicleType;

    public ParkingSpot(int spotNumber, boolean isAvailable, VehicleType vehicleType) {
        this.spotNumber = spotNumber;
        this.isAvailable = isAvailable;
        this.vehicleType = vehicleType;
    }

    public synchronized boolean park(Vehicle vehicle){
        if(!isAvailable || vehicle.getVehicleType()!=vehicleType) {
            return false;
        }
        isAvailable=false;
        this.vehicle=vehicle;
        this.vehicleType=vehicle.getVehicleType();
        return true;

    }

    public synchronized void unpark(){
        this.vehicle=null;
        this.vehicleType=null;
        this.isAvailable=true;
    }


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public int getSpotNumber() {
        return spotNumber;
    }

    public void setSpotNumber(int spotNumber) {
        this.spotNumber = spotNumber;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
