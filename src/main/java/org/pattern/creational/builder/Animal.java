package org.pattern.creational.builder;

class Animal {
    // Required fields
    private String species;

    // Optional fields
    private String name;
    private int age;
    private String color;

    // Private constructor, so only the Builder can construct it
    private Animal(AnimalBuilder builder) {
        this.species = builder.species;
        this.name = builder.name;
        this.age = builder.age;
        this.color = builder.color;
    }

    // Getters for fields
    public String getSpecies() {
        return species;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animal [species=" + species + ", name=" + name + ", age=" + age + ", color=" + color + "]";
    }


    public static class AnimalBuilder {
        // Required field
        private String species;

        // Optional fields
        private String name;
        private int age;
        private String color;

        // Constructor for the required field
        public AnimalBuilder(String species) {
            this.species = species;
        }

        // Setter methods for optional fields, returning the Builder object
        public AnimalBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public AnimalBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public AnimalBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        // Build method to return the constructed Animal object
        public Animal build() {
            return new Animal(this);
        }
    }
}
