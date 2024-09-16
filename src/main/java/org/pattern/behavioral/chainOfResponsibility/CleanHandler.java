package org.pattern.behavioral.chainOfResponsibility;

class CleanHandler extends Handler {
    @Override
    public void handleRequest(Request request) {
        if (request.getType() == Request.RequestType.CLEAN) {
            System.out.println("Cleaning enclosure: " + request.getDescription());
        } else {
            super.handleRequest(request); // Pass to next handler
        }
    }
}
