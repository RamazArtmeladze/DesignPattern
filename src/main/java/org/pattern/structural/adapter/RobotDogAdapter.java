package org.pattern.structural.adapter;

class RobotDogAdapter implements Animal {
    private RobotDog robotDog;

    // Constructor
    public RobotDogAdapter(RobotDog robotDog) {
        this.robotDog = robotDog;
    }

    @Override
    public void speak() {
        // Adapts RobotDog's makeSound to Animal's speak
        robotDog.makeSound();
    }
}