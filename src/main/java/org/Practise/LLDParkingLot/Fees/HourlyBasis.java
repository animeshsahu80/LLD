package org.Practise.LLDParkingLot.Fees;

import org.Practise.LLDParkingLot.Ticket;

public class HourlyBasis implements  FeeStrategy{
    @Override
    public double calculateFees(Ticket ticket){
        return 100*(Integer.parseInt(ticket.getOutTime())- Integer.parseInt(ticket.getInTime()));
    }
}
