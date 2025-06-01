package org.LLDDesignPatterns.MediatorDesignPattern;

public class Main {
    public static void main(String[] args) {
        AuctionMediator auctionMediator= new Auction();
        Colleague bidder1= new Bidder("A",auctionMediator);
        Colleague bidder2= new Bidder("B",auctionMediator);
        bidder2.placeBid(100);
        bidder1.placeBid(200);
        bidder2.placeBid(300);


    }
}
