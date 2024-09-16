package org.pattern.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

class BirdFactory {
    private static Map<String, BirdType> birdTypes = new HashMap<>();

    public static BirdType getBirdType(String species, String color, int size) {
        String key = species + "-" + color + "-" + size;
        if (!birdTypes.containsKey(key)) {
            birdTypes.put(key, new BirdType(species, color, size));
            System.out.println("Creating new BirdType: " + key);
        }
        return birdTypes.get(key);
    }
}
