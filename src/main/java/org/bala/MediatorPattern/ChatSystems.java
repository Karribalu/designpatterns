package org.bala.MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ChatSystems {
    private List<User> users;

    ChatSystems() {
        this.users = new ArrayList<>();
    }

    public void addUser(User user) {
        this.users.add(user);
    }

    public void sendMessage(String msg, User sender) {
        for (User user : users) {
            if (user.getUserId() != sender.getUserId()) {
                user.receiveMessage(msg, sender);
            }
        }
    }
}
