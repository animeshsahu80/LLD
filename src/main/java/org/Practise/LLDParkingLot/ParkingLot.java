package org.Practise.LLDParkingLot;

import org.Practise.LLDParkingLot.Fees.FeeStrategy;
import org.Practise.LLDParkingLot.Vehicle.Vehicle;
import org.Practise.LLDParkingLot.Ticket;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class ParkingLot {
    List<Floor> floors;
    FeeStrategy feeStrategy;

    private  static ParkingLot parkingLotInstance;
    List<Ticket> activeTickets;

    private  ParkingLot(){
        this.floors=new ArrayList<>();
        this.activeTickets= new ArrayList<>();

    }

    public static ParkingLot getParkingLotInstance(){
        if(parkingLotInstance==null){
            return new ParkingLot();
        }
        return  parkingLotInstance;
    }

    public Ticket parkVehicle(Vehicle vehicle, String inTime) throws  Exception{
        for (Floor floor: floors){
            Optional<ParkingSpot> parkingSpot= floor.getAvailableSpot(vehicle.getVehicleType());
            if(parkingSpot.isPresent()){
                ParkingSpot spot=parkingSpot.get();
                if(spot.park(vehicle)){
                    String id= UUID.randomUUID().toString();
                    Ticket ticket = new Ticket(vehicle ,id, inTime, spot);
                    return  ticket;
                }
            }
        }
        throw new Exception("No spot available for " + vehicle.getVehicleNumber());

    }

    public double unpark(Ticket ticket, String outTime){
        activeTickets.remove(ticket);
        ParkingSpot spot= ticket.getParkingSpot();
        spot.unpark();
        ticket.setOutTime(outTime);
        double fees= feeStrategy.calculateFees(ticket);
        return fees;

    }




    public List<Floor> getFloors() {
        return floors;
    }

    public void setFloors(List<Floor> floors) {
        this.floors = floors;
    }

    public FeeStrategy getFeeStrategy() {
        return feeStrategy;
    }

    public void setFeeStrategy(FeeStrategy feeStrategy) {
        this.feeStrategy = feeStrategy;
    }

    public List<Ticket> getActiveTickets() {
        return activeTickets;
    }

    public void setActiveTickets(List<Ticket> activeTickets) {
        this.activeTickets = activeTickets;
    }
}
