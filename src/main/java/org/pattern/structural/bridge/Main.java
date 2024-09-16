package org.pattern.structural.bridge;

/*
Without the Bridge pattern, you would likely need a separate class for each combination of animal and sound,
which could lead to a large number of classes and code duplication.
*/
public class Main {
    public static void main(String[] args) {
        // Dog with a Bark sound
        Animal barkingDog = new Dog(new Bark());
        barkingDog.makeSound();  // Output: Dog is Barking: Woof Woof!

        // Cat with a Meow sound
        Animal meowingCat = new Cat(new Meow());
        meowingCat.makeSound();  // Output: Cat is Meowing: Meow!

        // Dog with a Howl sound
        Animal howlingDog = new Dog(new Howl());
        howlingDog.makeSound();  // Output: Dog is Howling: Awoo!

        // Cat with a Howl sound (unusual, but possible with the Bridge pattern)
        Animal howlingCat = new Cat(new Howl());
        howlingCat.makeSound();  // Output: Cat is Howling: Awoo!
    }
}
