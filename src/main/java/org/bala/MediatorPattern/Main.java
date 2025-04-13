package org.bala.MediatorPattern;

public class Main {
    public static void main(String[] args) {
        ChatSystems chatSystems = new ChatSystems();
        User user1 = new User(1, chatSystems);
        User user2 = new User(2, chatSystems);
        User user3 = new User(7, chatSystems);
        chatSystems.addUser(user1);
        chatSystems.addUser(user2);
        chatSystems.addUser(user3);
        user1.sendMessage("hello giys");
        user2.sendMessage("hello giysads");
        user3.sendMessage("hello somebody");
    }
}
