package org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observer;

import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observable.StocksObservable;

public class EmailAlertObserverImpl implements NotificationAlertObserver{

    String emailId;

    StocksObservable stocksObservable;

    public EmailAlertObserverImpl(StocksObservable stocksObservable, String mobileNumber){
        this.emailId=mobileNumber;
        this.stocksObservable=stocksObservable;
    }


    @Override
    public void update(){
        sendMail(emailId, "product is in stock");
    }

    public void sendMail(String emailId,String msg){
        System.out.println("mail : "+msg);
    }
}
