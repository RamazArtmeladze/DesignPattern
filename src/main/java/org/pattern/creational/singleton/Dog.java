package org.pattern.creational.singleton;

class Dog {
    private static Dog instance;

    private Dog() {
    }

    public static Dog getInstance() {
        if (instance == null) {
            synchronized (Dog.class) {
                if (instance == null) {
                    instance = new Dog();
                }
            }
        }
        return instance;
    }
    public static void main(String[] args) {

        Dog dog = Dog.getInstance();
        Dog anotherDog = Dog.getInstance();

        System.out.println(dog == anotherDog); // true
    }
}
