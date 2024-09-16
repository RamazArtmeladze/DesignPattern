package org.pattern.creational.prototype;

class Dog implements Animal {
    private String breed;

    public Dog(String breed) {
        this.breed = breed;
        System.out.println("Creating a new Dog: " + breed);
    }

    @Override
    public Dog clone() {
        System.out.println("Cloning a Dog: " + breed);
        return new Dog(this.breed);  // Create a new Dog with the same breed
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! I am a " + breed);
    }
}
