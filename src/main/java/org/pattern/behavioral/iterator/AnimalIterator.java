package org.pattern.behavioral.iterator;

public class AnimalIterator implements Iterator<Animal> {
    private Animal[] animals;
    private int position = 0;

    public AnimalIterator(Animal[] animals) {
        this.animals = animals;
    }

    @Override
    public boolean hasNext() {
        return position < animals.length && animals[position] != null;
    }

    @Override
    public Animal next() {
        return animals[position++];
    }
}
