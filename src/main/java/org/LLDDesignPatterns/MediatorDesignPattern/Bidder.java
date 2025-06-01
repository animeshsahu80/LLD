package org.LLDDesignPatterns.MediatorDesignPattern;

public class Bidder implements Colleague{
    String name;
    AuctionMediator auctionMediator;
    Bidder(String name, AuctionMediator auctionMediator){
        this.name= name;
        this.auctionMediator=auctionMediator;
        auctionMediator.addBidder(this);
    }
    @Override
    public void placeBid(int amount){
        auctionMediator.notify(this,amount);
    }
    @Override
    public void sendNotification(int amount){
        System.out.println("this is bidder " + name + " and his bid is : " + amount);

    }
    @Override
    public String getName() {
        return name;
    }


}
