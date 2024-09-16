package org.pattern.creational.builder;

public class Main {
    public static void main(String[] args) {
        // Create an Animal using the Builder pattern
        Animal dog = new Animal.AnimalBuilder("Dog")
                .setName("Buddy")
                .setAge(5)
                .setColor("Brown")
                .build();

        Animal cat = new Animal.AnimalBuilder("Cat")
                .setName("Whiskers")
                .setAge(3)
                .build();  // No color provided

        // Output the constructed Animal objects
        System.out.println(dog);  // Output: Animal [species=Dog, name=Buddy, age=5, color=Brown]
        System.out.println(cat);  // Output: Animal [species=Cat, name=Whiskers, age=3, color=null]
    }
}
