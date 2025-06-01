package org.LLDDesignPatterns.MediatorDesignPattern;

public interface AuctionMediator {
    void addBidder(Colleague bidder);

    void notify(Colleague bidder, int amount);


}
