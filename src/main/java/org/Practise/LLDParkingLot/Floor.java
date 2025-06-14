package org.Practise.LLDParkingLot;

import org.Practise.LLDParkingLot.Vehicle.Vehicle;
import org.Practise.LLDParkingLot.Vehicle.VehicleType;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Floor {
    int floorNumber;
    List<ParkingSpot> parkingSpotList;

    public Floor(int floorNumber, List<ParkingSpot> parkingSpotList) {
        this.floorNumber = floorNumber;
        this.parkingSpotList = parkingSpotList;
    }


    public Optional<ParkingSpot>  getAvailableSpot(VehicleType vehicleType){
        return  parkingSpotList.stream()
                .filter(parkingSpot -> parkingSpot.isAvailable&& parkingSpot.getVehicleType()==vehicleType)
                .findFirst();
    }
    public int getFloorNumber() {
        return floorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        this.floorNumber = floorNumber;
    }

    public List<ParkingSpot> getParkingSpotList() {
        return parkingSpotList;
    }

    public void setParkingSpotList(List<ParkingSpot> parkingSpotList) {
        this.parkingSpotList = parkingSpotList;
    }
}
