package org.pattern.creational.abstractFactory;

class DogFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Dog();
    }

    @Override
    public Habitat createHabitat() {
        return new DogHouse();
    }
}