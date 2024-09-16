package org.pattern.creational.abstractFactory;

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}
