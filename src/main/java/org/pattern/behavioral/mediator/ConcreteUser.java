package org.pattern.behavioral.mediator;

public class ConcreteUser extends User {

    public ConcreteUser(ChatMediator chatMediator, String name) {
        super(chatMediator, name);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(this.name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}
