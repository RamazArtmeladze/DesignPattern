package org.pattern.creational.prototype;

public class Main {
    public static void main(String[] args) {
        // Create original objects
        Animal originalDog = new Dog("Labrador");
        Animal originalCat = new Cat("Black");

        // Clone the original objects
        Animal clonedDog = originalDog.clone();
        Animal clonedCat = originalCat.clone();

        // Use the original and cloned objects
        System.out.println("\nOriginal and cloned animals making sounds:");
        originalDog.makeSound();  // Output: Woof! I am a Labrador
        clonedDog.makeSound();    // Output: Woof! I am a Labrador

        originalCat.makeSound();  // Output: Meow! I am a Black cat.
        clonedCat.makeSound();    // Output: Meow! I am a Black cat.
    }
}
