package org.Practise.LLDParkingLot.Fees;

import org.Practise.LLDParkingLot.Ticket;

public class TypeBasis implements FeeStrategy{
    @Override
    public double calculateFees(Ticket ticket) {
        double rate=0.0;
        switch (ticket.getVehicle().getVehicleType()){
            case BUS:
                rate= 100.0;
                break;
            case CAR:
                rate= 50.0;
                break;
            case BIKE:
                rate= 20.0;
                break;
        }
        return rate;
    }
}
