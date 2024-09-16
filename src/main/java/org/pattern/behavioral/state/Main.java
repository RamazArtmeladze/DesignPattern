package org.pattern.behavioral.state;
/*
Without the State pattern, the behavior of the traffic light would be handled using conditional logic
(e.g., if-else or switch statements) to determine the current state and transition between states.
 */

public class Main {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight();

        // Change state multiple times
        light.change(); // Red to Green
        light.change(); // Green to Yellow
        light.change(); // Yellow to Red
        light.change(); // Red to Green
    }
}
