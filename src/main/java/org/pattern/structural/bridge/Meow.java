package org.pattern.structural.bridge;

class Meow implements SoundType {
    @Override
    public void makeSound() {
        System.out.println("Meowing: Meow!");
    }
}
