package org.Practise.LLDParkingLot.Vehicle;

public class Vehicle {
    String vehicleNumber;
    VehicleType vehicleType;

    Vehicle(String vehicleNumber, VehicleType vehicleType){
        this.vehicleNumber=vehicleNumber;
        this.vehicleType=vehicleType;

    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public void setVehicleNumber(String vehicleNumber) {
        this.vehicleNumber = vehicleNumber;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }
}
