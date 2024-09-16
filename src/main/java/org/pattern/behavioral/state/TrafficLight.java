package org.pattern.behavioral.state;

public class TrafficLight {
    private TrafficLightState currentState;

    public TrafficLight() {
        // Initial state is Red
        this.currentState = new RedState();
    }

    public void setState(TrafficLightState state) {
        this.currentState = state;
    }

    public void change() {
        currentState.handle(this);
    }
}
