package org.ObserverDesignPattern.Observable;

import org.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {
    public void addObserver(NotificationAlertObserver observer);
    public void removeObserver(NotificationAlertObserver observer);
    public void notifyObservers();
    public void setStockCount(int newStockCount);
    public int getStockCount();
    public boolean checkStock();
}
