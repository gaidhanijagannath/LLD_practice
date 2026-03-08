package org.ObserverDesignPattern.Observable;

import org.ObserverDesignPattern.Observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IphoneObservableImpl implements StockObservable {

    List<NotificationAlertObserver> notificationAlertObserverList = new ArrayList<>();
    public int stockCount = 0;

    @Override
    public void addObserver(NotificationAlertObserver observer) {
        notificationAlertObserverList.add(observer);
    }

    @Override
    public void removeObserver(NotificationAlertObserver observer) {
        notificationAlertObserverList.remove(observer);
    }

    @Override
    public void notifyObservers() {

        for(NotificationAlertObserver observer : notificationAlertObserverList){
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockCount) {

        stockCount = stockCount + newStockCount; // Update stock count first

    }

    @Override
    public int getStockCount() {
        return stockCount;
    }

    @Override
    public boolean checkStock() {
        if (stockCount == 0) { // Notify observers only when stock is zero
            notifyObservers();
            return false;
        }
        return true;
    }
}
