package org.pattern.behavioral.chainOfResponsibility;

/*
Without this pattern, you would need to check each request type manually in a single block of code,
which can become large and unwieldy as the number of request types grows.
 */

public class Main {
    public static void main(String[] args) {
        // Create handlers
        Handler feedHandler = new FeedHandler();
        Handler healthCheckHandler = new HealthCheckHandler();
        Handler cleanHandler = new CleanHandler();

        // Set up the chain
        feedHandler.setNextHandler(healthCheckHandler);
        healthCheckHandler.setNextHandler(cleanHandler);

        // Create requests
        Request feedRequest = new Request(Request.RequestType.FEED, "Feed the lions");
        Request healthCheckRequest = new Request(Request.RequestType.HEALTH_CHECK, "Check the giraffes' health");
        Request cleanRequest = new Request(Request.RequestType.CLEAN, "Clean the elephant enclosure");
        Request unknownRequest = new Request(null, "Unknown task");

        // Process requests
        System.out.println("Processing requests:");
        feedHandler.handleRequest(feedRequest);          // Handled by FeedHandler
        feedHandler.handleRequest(healthCheckRequest);   // Handled by HealthCheckHandler
        feedHandler.handleRequest(cleanRequest);         // Handled by CleanHandler
        feedHandler.handleRequest(unknownRequest);       // No handler available for this request
    }
}
