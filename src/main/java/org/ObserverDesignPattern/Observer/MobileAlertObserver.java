package org.ObserverDesignPattern.Observer;

import org.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserver implements NotificationAlertObserver{
    String userName;
    StockObservable stockObservable;

    public MobileAlertObserver(String userName, StockObservable stockObservable) {
        this.userName = userName;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendNotificationOnMobile(userName,"Iphone in out of stock");
    }

    private void sendNotificationOnMobile(String userName, String s) {
        System.out.println("Notification sent to " + userName + " with message: " + s);
    }
}
