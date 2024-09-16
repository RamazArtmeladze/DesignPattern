package org.pattern.structural.proxy;

class ProxyAnimal implements Animal {
    private String name;
    private RealAnimal realAnimal;

    public ProxyAnimal(String name) {
        this.name = name;
    }

    @Override
    public void displayInfo() {
        // Only load the RealAnimal when needed
        if (realAnimal == null) {
            realAnimal = new RealAnimal(name);
        }
        realAnimal.displayInfo();
    }
}
