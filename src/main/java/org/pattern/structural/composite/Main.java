package org.pattern.structural.composite;

/*
Without the Composite pattern, you would need to write separate code to handle individual animals and groups of animals.
This could lead to a lot of duplicated code and special handling for different cases.

The Composite pattern is useful for modeling structures where you want to work with both individual elements
and groups of elements in the same way, like individual animals and herds in this example.
 */
public class Main {
    public static void main(String[] args) {
        // Individual animals (leaf components)
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Create a herd (composite) and add animals to it
        Herd herd = new Herd();
        herd.addAnimal(dog);
        herd.addAnimal(cat);

        // Create another herd (composite) and add a single animal and the first herd to it
        Herd biggerHerd = new Herd();
        biggerHerd.addAnimal(new Dog());  // Add another dog
        biggerHerd.addAnimal(herd);       // Add the first herd

        // Make the individual animals make a sound
        System.out.println("Individual Animal Sounds:");
        dog.makeSound();  // Output: Woof!
        cat.makeSound();  // Output: Meow!

        // Make the herd make sounds
        System.out.println("\nHerd Sounds:");
        herd.makeSound();  // Output: Woof! Meow!

        // Make the bigger herd make sounds
        System.out.println("\nBigger Herd Sounds:");
        biggerHerd.makeSound();  // Output: Woof! Woof! Meow!
    }
}

