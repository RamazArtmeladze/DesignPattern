package org.pattern.structural.decorator;

class Dog implements Animal {
    @Override
    public void makeSound() {
        System.out.println("Woof!");
    }
}