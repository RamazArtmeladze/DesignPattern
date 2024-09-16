package org.pattern.behavioral.chainOfResponsibility;

abstract class Handler {
    private Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public void handleRequest(Request request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler available for the request: " + request.getDescription());
        }
    }
}
