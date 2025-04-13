package org.bala.MediatorPattern;

public class User {
    private int userId;
    private ChatSystems chatSystems;

    User(int id, ChatSystems chatSystems) {
        this.userId = id;
        this.chatSystems = chatSystems;
    }

    public void receiveMessage(String msg, User sender) {
        System.out.println("Message Recieved from " + sender + " is " + msg + " to " + this.userId);
    }

    public void sendMessage(String msg) {
        System.out.println("Sending message from " + this.userId);
        this.chatSystems.sendMessage(msg, this);
    }

    public int getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                '}';
    }
}
