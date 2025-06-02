package org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observable;

import org.LLDDesignPatterns.ObserverDesignPattern.NotifyMe.Observer.NotificationAlertObserver;

public interface StocksObservable {
    public void add(NotificationAlertObserver notificationAlertObserver);

    public void remove(NotificationAlertObserver notificationAlertObserver);

    public void notifySubs();

    public void setStockCount(int stock);

    public int getStockCount();
}
