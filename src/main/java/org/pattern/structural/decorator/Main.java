package org.pattern.structural.decorator;

// Without the Decorator pattern, you would need to create subclasses or modify the original class to add new behaviors.
// The Decorator pattern provides a flexible way to extend the functionality of objects dynamically without modifying their class structure.
public class Main {
    public static void main(String[] args) {
        // Create a simple dog (concrete component)
        Animal dog = new Dog();
        System.out.println("Simple Dog:");
        dog.makeSound();  // Output: Woof!

        // Decorate the dog with a collar
        Animal collaredDog = new CollarDecorator(dog);
        System.out.println("\nCollared Dog:");
        collaredDog.makeSound();  // Output: Woof! ...while wearing a collar.

        // Decorate the collared dog with a leash
        Animal collaredLeashedDog = new LeashDecorator(collaredDog);
        System.out.println("\nCollared and Leashed Dog:");
        collaredLeashedDog.makeSound();  // Output: Woof! ...while wearing a collar. ...while on a leash.

        // Decorate the dog directly with a leash (without a collar)
        Animal leashedDog = new LeashDecorator(dog);
        System.out.println("\nLeashed Dog:");
        leashedDog.makeSound();  // Output: Woof! ...while on a leash.
    }
}
