package org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observable;

import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneStockObservableImpl implements StocksObservable{

    public List<NotificationAlertObserver> observerList=new ArrayList<>();
    public int stockCount=0;

    @Override
    public void add(NotificationAlertObserver notificationAlertObserver){
        observerList.add(notificationAlertObserver);
    }

    @Override
    public void remove(NotificationAlertObserver notificationAlertObserver){
        observerList.remove(notificationAlertObserver);
    }
    @Override
    public void notifySubs(){
        for(NotificationAlertObserver notificationAlertObserver:observerList){
            notificationAlertObserver.update();
        }
    };

    @Override
    public void setStockCount(int newStock){
        if(stockCount==0){
            notifySubs();
        }
        stockCount+= newStock;
    }

    @Override
    public int getStockCount(){
        return stockCount;
    }
}
