package org.pattern.behavioral.templateMethod;

public class Coffee extends Beverage {
    @Override
    protected void brew() {
        System.out.println("Brewing the coffee...");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk...");
    }
}