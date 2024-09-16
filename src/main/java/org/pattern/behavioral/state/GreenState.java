package org.pattern.behavioral.state;

public class GreenState implements TrafficLightState {
    @Override
    public void handle(TrafficLight light) {
        System.out.println("Green Light - Go!");
        light.setState(new YellowState()); // Transition to Yellow state
    }
}
