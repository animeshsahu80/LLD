package org.LLDDesignPatterns.MediatorDesignPattern;

import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.List;

public class Auction implements  AuctionMediator{
    List <Colleague> colleagues= new ArrayList<>();

    @Override
    public void addBidder(Colleague colleague){
        colleagues.add(colleague);
    }

    @Override
    public void notify(Colleague bidder, int amount){
        for (Colleague colleague: colleagues){
            if(! colleague.getName().equals(bidder.getName())){
                colleague.sendNotification(amount);
            }

        }
    }


}
