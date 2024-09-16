package org.pattern.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class Stock implements Subject {
    private List<Observer> observers;
    private float price;

    public Stock(float price) {
        observers = new ArrayList<>();
        this.price = price;
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.price);
        }
    }

    public void setPrice(float price) {
        this.price = price;
        notifyObservers();
    }
}
