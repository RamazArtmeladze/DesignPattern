package org.pattern.behavioral.templateMethod;

// Without the Template Method pattern, you would likely duplicate the common steps
// in both Tea and Coffee classes, leading to code redundancy.


public class Main {
    public static void main(String[] args) {
        Beverage tea = new Tea();
        Beverage coffee = new Coffee();

        System.out.println("Preparing tea:");
        tea.prepareRecipe(); // Prepare tea

        System.out.println("\nPreparing coffee:");
        coffee.prepareRecipe(); // Prepare coffee
    }
}