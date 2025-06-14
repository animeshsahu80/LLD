package org.Practise.LLDParkingLot.Fees;

import org.Practise.LLDParkingLot.Ticket;

public interface FeeStrategy {
    public double calculateFees(Ticket ticket);
}
