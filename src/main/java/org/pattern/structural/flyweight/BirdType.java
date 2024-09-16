package org.pattern.structural.flyweight;

class BirdType implements Bird {
    private String species;
    private String color;
    private int size;

    public BirdType(String species, String color, int size) {
        this.species = species;
        this.color = color;
        this.size = size;
    }

    @Override
    public void draw(int x, int y) {
        System.out.println("Drawing a " + species + " bird at (" + x + ", " + y +
                ") with color " + color + " and size " + size);
    }
}