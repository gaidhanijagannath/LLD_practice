package org.ObserverDesignPattern;

import org.ObserverDesignPattern.Observable.IphoneObservableImpl;
import org.ObserverDesignPattern.Observable.StockObservable;
import org.ObserverDesignPattern.Observer.EmailAlertObserver;
import org.ObserverDesignPattern.Observer.MobileAlertObserver;
import org.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {
    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservableImpl();
        
        NotificationAlertObserver observer1 = new EmailAlertObserver("jagannath@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new MobileAlertObserver("kiranPatil", iphoneStockObservable);
        NotificationAlertObserver observer3 = new EmailAlertObserver("jagannath@gmail.com", iphoneStockObservable);

        iphoneStockObservable.addObserver(observer1);
        iphoneStockObservable.addObserver(observer2);
        iphoneStockObservable.addObserver(observer3);

        System.out.println("Stock status :" + iphoneStockObservable.checkStock());

        iphoneStockObservable.setStockCount(10);
        System.out.println("Stock status :" + iphoneStockObservable.checkStock() + "\nCurrent stock is : " + iphoneStockObservable.getStockCount());


    }
}
