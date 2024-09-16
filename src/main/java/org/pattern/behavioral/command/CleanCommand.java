package org.pattern.behavioral.command;

class CleanCommand implements Command {
    private ZooOperations zooOperations;

    public CleanCommand(ZooOperations zooOperations) {
        this.zooOperations = zooOperations;
    }

    @Override
    public void execute() {
        zooOperations.cleanEnclosures(); // Executes cleaning operation
    }
}
