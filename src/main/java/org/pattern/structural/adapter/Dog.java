package org.pattern.structural.adapter;

import org.pattern.structural.adapter.Animal;

class Dog implements Animal {
    @Override
    public void speak() {
        System.out.println("Woof!");
    }
}

