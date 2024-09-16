package org.pattern.behavioral.command;

/*
Without the Command pattern, the ZooKeeper would need to call the ZooOperations methods directly,
leading to tight coupling between the invoker and the operations, and reducing flexibility:
 */

public class Main {
    public static void main(String[] args) {
        // Create the receiver
        ZooOperations zooOperations = new ZooOperations();

        // Create commands
        Command feedCommand = new FeedCommand(zooOperations);
        Command cleanCommand = new CleanCommand(zooOperations);
        Command healthCheckCommand = new HealthCheckCommand(zooOperations);

        // Create the invoker
        ZooKeeper zooKeeper = new ZooKeeper();

        // Perform feed action
        zooKeeper.setCommand(feedCommand);
        zooKeeper.performAction();  // Feeding all animals...

        // Perform clean action
        zooKeeper.setCommand(cleanCommand);
        zooKeeper.performAction();  // Cleaning all enclosures...

        // Perform health check action
        zooKeeper.setCommand(healthCheckCommand);
        zooKeeper.performAction();  // Performing health check on all animals...
    }
}
