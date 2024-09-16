package org.pattern.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;

    public ChatRoom() {
        this.users = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        // Broadcast message to all users except the sender
        for (User u : users) {
            if (u != user) {
                u.receiveMessage(message);
            }
        }
    }
}
