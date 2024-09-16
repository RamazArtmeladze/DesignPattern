package org.pattern.behavioral.state;

public class RedState implements TrafficLightState {
    @Override
    public void handle(TrafficLight light) {
        System.out.println("Red Light - Stop!");
        light.setState(new GreenState()); // Transition to Green state
    }
}

