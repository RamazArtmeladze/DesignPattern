package org.pattern.creational.factory;

/*
client (main) class is responsible to use classes. so it is ease to maintain code.
 */

public class Main {
    public static void main(String[] args) {
        AnimalFactory factory = new AnimalFactory();

        // Create a Dog
        Animal dog = factory.createAnimal("dog");
        dog.speak(); // Output: Woof!

        // Create a Cat
        Animal cat = factory.createAnimal("cat");
        cat.speak(); // Output: Meow!
    }
}

