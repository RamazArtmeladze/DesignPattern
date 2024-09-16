package org.pattern.structural.bridge;

class Cat extends Animal {
    public Cat(SoundType soundType) {
        super(soundType);
    }

    @Override
    public void makeSound() {
        System.out.print("Cat is ");
        soundType.makeSound();
    }
}
