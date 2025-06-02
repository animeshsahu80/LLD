package org.LLDDesignPatterns.ObserverDesignPattern;

import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observable.IphoneStockObservableImpl;
import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observable.StocksObservable;
import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observer.EmailAlertObserverImpl;
import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observer.MobileAlertObserverImpl;
import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observer.NotificationAlertObserver;

public class Main {
    public static void main(String[] args) {
        StocksObservable iphoneStockObservable= new IphoneStockObservableImpl();
        NotificationAlertObserver mobileRecp=new MobileAlertObserverImpl(iphoneStockObservable,"12345678");
        NotificationAlertObserver EmailRecp=new EmailAlertObserverImpl(iphoneStockObservable,"test@mail");

        iphoneStockObservable.add(mobileRecp);
        iphoneStockObservable.add(EmailRecp);

        iphoneStockObservable.setStockCount(2);

    }
}
