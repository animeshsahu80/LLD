package org.Practise.LLDParkingLot;

import org.Practise.LLDParkingLot.Vehicle.Vehicle;

import java.util.Date;

public class Ticket  {
    Vehicle vehicle;
    String inTime;
    String outTime;
    String id;
    ParkingSpot parkingSpot;


    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public String getInTime() {
        return inTime;
    }

    public void setInTime(String inTime) {
        this.inTime = inTime;
    }

    public String getOutTime() {
        return outTime;
    }

    public void setOutTime(String outTime) {
        this.outTime = outTime;
    }

    public String  getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ParkingSpot getParkingSpot() {
        return parkingSpot;
    }

    public void setParkingSpot(ParkingSpot parkingSpot) {
        this.parkingSpot = parkingSpot;
    }

    public Ticket(Vehicle vehicle, String id, String inTime, ParkingSpot parkingSpot) {
        this.vehicle = vehicle;
        this.id = id;
        this.inTime = inTime;
        this.parkingSpot = parkingSpot;
    }








}
