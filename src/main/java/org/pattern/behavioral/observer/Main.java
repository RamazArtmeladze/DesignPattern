package org.pattern.behavioral.observer;

/*
Without the Observer pattern, the subject (Stock) would have to keep direct references to each observer
and manually notify them of changes.
 */

public class Main {
    public static void main(String[] args) {
        // Create the stock (subject)
        Stock appleStock = new Stock(150.00f);

        // Create observers (investors)
        Investor investor1 = new Investor("Alice");
        Investor investor2 = new Investor("Bob");

        // Add investors to the stock's observer list
        appleStock.addObserver(investor1);
        appleStock.addObserver(investor2);

        // Change stock price and notify observers
        appleStock.setPrice(155.00f); // Both Alice and Bob will be notified
        appleStock.setPrice(160.00f); // Both Alice and Bob will be notified again

        // Remove one observer and change the stock price
        appleStock.removeObserver(investor1);
        appleStock.setPrice(165.00f); // Only Bob will be notified
    }
}
