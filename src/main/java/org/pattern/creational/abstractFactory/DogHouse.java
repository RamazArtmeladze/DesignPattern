package org.pattern.creational.abstractFactory;

class DogHouse implements Habitat {
    @Override
    public void describe() {
        System.out.println("This is a doghouse.");
    }
}
