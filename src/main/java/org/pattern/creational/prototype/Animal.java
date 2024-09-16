package org.pattern.creational.prototype;

public interface Animal extends Cloneable {
    Animal clone();
    void makeSound();
}

