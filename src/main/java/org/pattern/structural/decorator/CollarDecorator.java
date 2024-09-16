package org.pattern.structural.decorator;

class CollarDecorator extends AnimalDecorator {
    public CollarDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("...while wearing a collar.");
    }
}
