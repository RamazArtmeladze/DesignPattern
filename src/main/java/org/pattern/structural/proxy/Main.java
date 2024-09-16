package org.pattern.structural.proxy;


/*
Without the Proxy pattern, the client would interact directly with the RealAnimal class,
and the costly operation (data loading) would happen immediately, whether or not it is necessary
 */


public class Main {
    public static void main(String[] args) {
        // Proxy controls access to RealAnimal and delays loading until necessary
        Animal animal1 = new ProxyAnimal("Lion");
        Animal animal2 = new ProxyAnimal("Tiger");

        System.out.println("Accessing animals without triggering data load...");
        // Display information (triggers lazy loading)
        animal1.displayInfo(); // Will load data here
        animal2.displayInfo(); // Will load data here

        // Further calls will not reload the data
        System.out.println("\nAccessing animals again (data already loaded)...");
        animal1.displayInfo();
        animal2.displayInfo();
    }
}
