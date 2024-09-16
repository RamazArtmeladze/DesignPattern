package org.pattern.structural.proxy;

class RealAnimal implements Animal {
    private String name;

    public RealAnimal(String name) {
        this.name = name;
        loadFromDatabase(name); // Simulates a costly operation like fetching data from a database
    }

    private void loadFromDatabase(String name) {
        System.out.println("Loading animal data for: " + name + " from the database...");
        try {
            Thread.sleep(2000); // Simulate a delay in loading data
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Displaying detailed information for: " + name);
    }
}
