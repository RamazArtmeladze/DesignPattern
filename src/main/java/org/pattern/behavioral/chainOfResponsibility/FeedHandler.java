package org.pattern.behavioral.chainOfResponsibility;

class FeedHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.FEED) {
            System.out.println("Feeding animals: " + request.getDescription());
        } else {
            super.handleRequest(request); // Pass to next handler
        }
    }
}
