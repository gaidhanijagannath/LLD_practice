package org.ObserverDesignPattern.Observer;

import org.ObserverDesignPattern.Observable.StockObservable;

public class EmailAlertObserver implements NotificationAlertObserver{
    String emailID;
    StockObservable stockObservable;

    public EmailAlertObserver(String emailID, StockObservable stockObservable) {
        this.emailID = emailID;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
        sendEmail(emailID,"Iphone is out stock ");
    }

    private void sendEmail(String emailID, String s) {
        System.out.println("Email sent to " + emailID + " with message: " + s);
    }
}
