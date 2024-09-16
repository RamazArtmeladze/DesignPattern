package org.pattern.structural.decorator;

class LeashDecorator extends AnimalDecorator {
    public LeashDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("...while on a leash.");
    }
}
