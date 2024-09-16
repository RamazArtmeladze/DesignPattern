package org.pattern.behavioral.chainOfResponsibility;

public class Request {
    public enum RequestType {
        FEED, HEALTH_CHECK, CLEAN
    }

    private RequestType type;
    private String description;

    public Request(RequestType type, String description) {
        this.type = type;
        this.description = description;
    }

    public RequestType getType() {
        return type;
    }

    public String getDescription() {
        return description;
    }
}
