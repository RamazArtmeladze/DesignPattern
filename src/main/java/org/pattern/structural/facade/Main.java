package org.pattern.structural.facade;


// Without the Facade pattern, the client would need to interact with each subsystem individually, which could be more complicated.
public class Main {
    public static void main(String[] args) {
        // Create the facade to handle animal care
        AnimalCareFacade animalCareFacade = new AnimalCareFacade();

        // Use the facade to simplify the interaction
        System.out.println("\nNormal Animal Care:");
        animalCareFacade.takeCareOfAnimal();

        System.out.println("\nEmergency Animal Care:");
        animalCareFacade.emergencyCare();
    }
}
