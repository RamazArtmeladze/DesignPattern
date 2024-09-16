package org.pattern.structural.adapter;

// It's like a bridge between two classes that otherwise couldn’t work together because they have different interfaces.

public class Main {
    public static void main(String[] args) {
        // Existing animal (Dog)
        Animal dog = new Dog();
        dog.speak();  // Output: Woof!

        // New incompatible RobotDog
        RobotDog robotDog = new RobotDog();

        // Adapt RobotDog to fit the Animal interface
        Animal adaptedRobotDog = new RobotDogAdapter(robotDog);
        adaptedRobotDog.speak();  // Output: Beep Boop! Robot Dog Sound!
    }
}