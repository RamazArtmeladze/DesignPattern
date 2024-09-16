package org.pattern.behavioral.observer;

public class Investor implements Observer {
    private String name;

    public Investor(String name) {
        this.name = name;
    }

    @Override
    public void update(float stockPrice) {
        System.out.println(name + " notified of stock price change: " + stockPrice);
    }
}
