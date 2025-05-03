package org.bala.LLDProblems.Linkedin;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String userId;
    private String email;
    private String name;
    private String password;
    private List<Message> inbox;
    private List<Connections> connections;
    private List<Message> sentMessages;
    private Profile profile;

    public User(String userId, String email, String name, String password) {
        this.userId = userId;
        this.email = email;
        this.name = name;
        this.password = password;
        this.connections = new ArrayList<>();
        this.inbox = new ArrayList<>();
        this.sentMessages = new ArrayList<>();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Message> getInbox() {
        return inbox;
    }

    public void setInbox(List<Message> inbox) {
        this.inbox = inbox;
    }

    public List<Connections> getConnections() {
        return connections;
    }

    public void setConnections(List<Connections> connections) {
        this.connections = connections;
    }


    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    public Profile getProfile() {
        return profile;
    }

    public List<Message> getSentMessages() {
        return sentMessages;
    }

    public void setSentMessages(List<Message> sentMessages) {
        this.sentMessages = sentMessages;
    }
}
