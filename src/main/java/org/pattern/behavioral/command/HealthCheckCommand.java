package org.pattern.behavioral.command;

class HealthCheckCommand implements Command {
    private ZooOperations zooOperations;

    public HealthCheckCommand(ZooOperations zooOperations) {
        this.zooOperations = zooOperations;
    }

    @Override
    public void execute() {
        zooOperations.performHealthCheck(); // Executes health check operation
    }
}
