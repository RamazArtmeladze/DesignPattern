package org.pattern.structural.bridge;

class Dog extends Animal {
    public Dog(SoundType soundType) {
        super(soundType);
    }

    @Override
    public void makeSound() {
        System.out.print("Dog is ");
        soundType.makeSound();
    }
}
