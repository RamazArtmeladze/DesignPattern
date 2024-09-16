package org.pattern.structural.bridge;

abstract class Animal {
    protected SoundType soundType;  // Bridge between Animal and SoundType

    // Constructor takes a SoundType implementation
    public Animal(SoundType soundType) {
        this.soundType = soundType;
    }

    public abstract void makeSound();  // Abstract method for making sound
}
