package org.pattern.behavioral.command;

class FeedCommand implements Command {
    private ZooOperations zooOperations;

    public FeedCommand(ZooOperations zooOperations) {
        this.zooOperations = zooOperations;
    }

    @Override
    public void execute() {
        zooOperations.feedAnimals(); // Executes feeding operation
    }
}
