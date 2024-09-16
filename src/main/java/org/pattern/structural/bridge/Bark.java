package org.pattern.structural.bridge;

class Bark implements SoundType {
    @Override
    public void makeSound() {
        System.out.println("Barking: Woof Woof!");
    }
}
