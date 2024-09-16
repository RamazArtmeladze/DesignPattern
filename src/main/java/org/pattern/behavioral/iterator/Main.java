package org.pattern.behavioral.iterator;

/*
Without the Iterator pattern, the client would have to deal with the internal structure of the collection
(in this case, an array). This can lead to duplication of traversal logic
and make it harder to switch the underlying data structure.
 */

public class Main {
    public static void main(String[] args) {
        // Create a zoo with a collection of animals
        Zoo zoo = new Zoo(5);
        zoo.addAnimal(new Animal("Lion"));
        zoo.addAnimal(new Animal("Elephant"));
        zoo.addAnimal(new Animal("Giraffe"));
        zoo.addAnimal(new Animal("Zebra"));

        // Get an iterator for the zoo collection
        Iterator<Animal> iterator = zoo.createIterator();

        // Iterate through the animals in the zoo
        System.out.println("Animals in the zoo:");
        while (iterator.hasNext()) {
            Animal animal = iterator.next();
            System.out.println(animal.getName());
        }
    }
}
