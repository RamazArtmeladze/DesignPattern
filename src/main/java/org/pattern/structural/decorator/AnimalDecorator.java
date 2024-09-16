package org.pattern.structural.decorator;

abstract class AnimalDecorator implements Animal {
    protected Animal animal;  // Wrapped animal

    public AnimalDecorator(Animal animal) {
        this.animal = animal;
    }

    @Override
    public void makeSound() {
        animal.makeSound();  // Delegate the call to the wrapped animal
    }
}
