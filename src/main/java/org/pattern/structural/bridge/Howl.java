package org.pattern.structural.bridge;

class Howl implements SoundType {
    @Override
    public void makeSound() {
        System.out.println("Howling: Awoo!");
    }
}
