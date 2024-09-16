package org.pattern.behavioral.command;

class ZooKeeper {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void performAction() {
        if (command != null) {
            command.execute(); // Executes the command
        }
    }
}
