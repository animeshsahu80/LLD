package org.Practise.LLDParkingLot;

import org.Practise.LLDParkingLot.Fees.HourlyBasis;
import org.Practise.LLDParkingLot.Fees.TypeBasis;
import org.Practise.LLDParkingLot.Vehicle.Bike;
import org.Practise.LLDParkingLot.Vehicle.Car;
import org.Practise.LLDParkingLot.Vehicle.Vehicle;
import org.Practise.LLDParkingLot.Vehicle.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParkingLot parkingLot=ParkingLot.getParkingLotInstance();
        ParkingSpot parkingSpot= new ParkingSpot(1,true, VehicleType.BIKE);
        ParkingSpot parkingSpot1= new ParkingSpot(2,true,VehicleType.BUS);
        ParkingSpot parkingSpot2= new ParkingSpot(3,true,VehicleType.CAR);
        ParkingSpot parkingSpot3= new ParkingSpot(4,true,VehicleType.CAR);

        Floor floor1= new Floor(1, List.of(parkingSpot,parkingSpot1,parkingSpot2));
        Floor floor2= new Floor(2, List.of(parkingSpot3));

        parkingLot.setFloors(List.of(floor1,floor2));

        parkingLot.setFeeStrategy(new HourlyBasis());

        Vehicle car= new Car("123E");
        Vehicle bike = new Bike("234A");
        Vehicle bike2 = new Bike("331A");

        List<Ticket> parkingTickets = new ArrayList<>();
        try {
            Ticket ticket1=parkingLot.parkVehicle(car,"1");
            System.out.println("Car parked: " + ticket1.getId());
            parkingTickets.add(ticket1);
            Ticket ticket2=parkingLot.parkVehicle(bike,"2");
            System.out.println("bike parked: " + ticket2.getId());
            parkingTickets.add(ticket2);
            Ticket ticket3=parkingLot.parkVehicle(bike2,"1");
            System.out.println("bike 2 parked: " + ticket3.getId());
            parkingTickets.add(ticket3);
        }
        catch (Exception e){
            System.out.println("errorr"+e);

        }

        double fees=parkingLot.unpark(parkingTickets.get(0), "4");
        System.out.println("Fees is :" + fees);

    }
}
