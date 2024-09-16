package org.pattern.behavioral.iterator;

public class Zoo implements IterableCollection<Animal> {
    private Animal[] animals;
    private int index = 0;

    public Zoo(int size) {
        animals = new Animal[size];
    }

    public void addAnimal(Animal animal) {
        if (index < animals.length) {
            animals[index++] = animal;
        } else {
            System.out.println("Zoo is full, can't add more animals.");
        }
    }

    @Override
    public Iterator<Animal> createIterator() {
        return new AnimalIterator(animals);
    }
}