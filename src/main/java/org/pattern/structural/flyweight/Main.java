package org.pattern.structural.flyweight;


/*
Without the Flyweight pattern, each bird would have its own copy of the intrinsic properties,
which could lead to excessive memory usage
 */

public class Main {
    public static void main(String[] args) {
        // Create birds by sharing intrinsic data (species, color, size)
        BirdType sparrow = BirdFactory.getBirdType("Sparrow", "Brown", 5);
        BirdType parrot = BirdFactory.getBirdType("Parrot", "Green", 8);

        // Drawing birds at different locations (extrinsic state)
        sparrow.draw(10, 20);  // Location (x=10, y=20)
        sparrow.draw(15, 25);  // Location (x=15, y=25)

        parrot.draw(30, 40);   // Location (x=30, y=40)
        parrot.draw(35, 45);   // Location (x=35, y=45)

        // Reusing existing BirdType to avoid new object creation
        BirdType anotherSparrow = BirdFactory.getBirdType("Sparrow", "Brown", 5);
        anotherSparrow.draw(50, 60);  // Should reuse the same BirdType
    }
}
