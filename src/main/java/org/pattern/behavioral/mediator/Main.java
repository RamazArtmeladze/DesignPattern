package org.pattern.behavioral.mediator;

/*
Without the Mediator pattern, each User would need to directly manage references to all other User objects.
This would result in tightly coupled code and make it difficult to scale the system with more participants.
 */

public class Main {
    public static void main(String[] args) {
        // Create the mediator
        ChatMediator chatRoom = new ChatRoom();

        // Create users
        User user1 = new ConcreteUser(chatRoom, "Alice");
        User user2 = new ConcreteUser(chatRoom, "Bob");
        User user3 = new ConcreteUser(chatRoom, "Charlie");

        // Add users to the chat room
        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        // Users send messages
        user1.sendMessage("Hello, everyone!");
        user2.sendMessage("Hi, Alice!");
    }
}
