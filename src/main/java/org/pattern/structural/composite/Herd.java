package org.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

class Herd implements Animal {
    private List<Animal> animals = new ArrayList<>();

    // Add an animal (leaf or composite) to the herd
    public void addAnimal(Animal animal) {
        animals.add(animal);
    }

    // Remove an animal from the herd
    public void removeAnimal(Animal animal) {
        animals.remove(animal);
    }

    @Override
    public void makeSound() {
        for (Animal animal : animals) {
            animal.makeSound();  // Delegate the sound-making to each animal in the herd
        }
    }
}
