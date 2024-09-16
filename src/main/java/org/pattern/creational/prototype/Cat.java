package org.pattern.creational.prototype;

class Cat implements Animal {
    private String color;

    public Cat(String color) {
        this.color = color;
        System.out.println("Creating a new Cat: " + color);
    }

    @Override
    public Cat clone() {
        System.out.println("Cloning a Cat: " + color);
        return new Cat(this.color);  // Create a new Cat with the same color
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! I am a " + color + " cat.");
    }
}