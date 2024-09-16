package org.pattern.creational.abstractFactory;

// Ensures that related products (like Dog and DogHouse) are always used together.
// The goal is to provide an interface for creating families of related or dependent objects.

public class Main {
    public static void main(String[] args) {
        // Create a Dog Factory
        AnimalFactory dogFactory = new DogFactory();
        Animal dog = dogFactory.createAnimal();
        Habitat dogHouse = dogFactory.createHabitat();

        dog.speak();       // Output: Woof!
        dogHouse.describe(); // Output: This is a doghouse.

        // Create a Cat Factory
        AnimalFactory catFactory = new CatFactory();
        Animal cat = catFactory.createAnimal();
        Habitat catHouse = catFactory.createHabitat();

        cat.speak();       // Output: Meow!
        catHouse.describe(); // Output: This is a catHouse.
    }
}