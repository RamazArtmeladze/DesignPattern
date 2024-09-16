package org.pattern.behavioral.templateMethod;

public abstract class Beverage {
    // Template method defining the steps for making a beverage
    public final void prepareRecipe() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    // Common method for boiling water
    private void boilWater() {
        System.out.println("Boiling water...");
    }

    // Common method for pouring beverage into cup
    private void pourInCup() {
        System.out.println("Pouring into cup...");
    }

    // Abstract methods for steps that are different in each subclass
    protected abstract void brew(); // Brewing the main ingredient (e.g., tea or coffee)
    protected abstract void addCondiments(); // Adding condiments (e.g., lemon, sugar)
}
