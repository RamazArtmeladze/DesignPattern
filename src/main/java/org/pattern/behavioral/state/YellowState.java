package org.pattern.behavioral.state;

public class YellowState implements TrafficLightState {
    @Override
    public void handle(TrafficLight light) {
        System.out.println("Yellow Light - Slow down!");
        light.setState(new RedState()); // Transition to Red state
    }
}
