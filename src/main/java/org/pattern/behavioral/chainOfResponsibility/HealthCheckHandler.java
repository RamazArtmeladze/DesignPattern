package org.pattern.behavioral.chainOfResponsibility;

class HealthCheckHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.HEALTH_CHECK) {
            System.out.println("Performing health check: " + request.getDescription());
        } else {
            super.handleRequest(request); // Pass to next handler
        }
    }
}
