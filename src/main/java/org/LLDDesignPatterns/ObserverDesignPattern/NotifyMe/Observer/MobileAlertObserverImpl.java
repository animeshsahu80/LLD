package org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observer;

import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observable.StocksObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver{
    String mobileNumber;

    StocksObservable stocksObservable;

    public MobileAlertObserverImpl(StocksObservable stocksObservable,String mobileNumber){
        this.mobileNumber=mobileNumber;
        this.stocksObservable=stocksObservable;
    }


    @Override
    public void update(){
        sendSms(mobileNumber, "product is in stock");
    }

    public void sendSms(String mobileNumber,String msg){
        System.out.println("sms : " + msg);
    }
}
