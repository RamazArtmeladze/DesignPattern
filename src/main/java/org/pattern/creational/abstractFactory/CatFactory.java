package org.pattern.creational.abstractFactory;

class CatFactory implements AnimalFactory {
    @Override
    public Animal createAnimal() {
        return new Cat();
    }

    @Override
    public Habitat createHabitat() {
        return new CatHouse();
    }
}