package org.bala.LLDProblems.Linkedin;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;

public class LinkedInService {
    private LinkedInService instance = new LinkedInService();
    Map<String, User> users;
    Map<String, Job> jobPostings;
    Map<String, List<Notification>> notifications;
    private Random random;

    private LinkedInService() {
        this.users = new ConcurrentHashMap<>();
        this.jobPostings = new ConcurrentHashMap<>();
        this.notifications = new ConcurrentHashMap<>();
        this.random = new Random();
    }

    public LinkedInService getInstance() {
        return this.instance;
    }

    public void registerUser(User user) {
        this.users.put(user.getUserId(), user);
    }

    public User login(String email, String password) {
        User user = null;

        for (var currUser : this.users.values()) {
            if (currUser.getEmail().equals(email)) {
                user = currUser;
                break;
            }
        }
        if (user == null) {
            throw new IllegalArgumentException("User not found");
        }
        if (user.getPassword().equals(password)) {
            throw new IllegalArgumentException("Email and Password does not match");
        }
        return user;
    }

    public void updateProfile(Profile profile, String userId) {
        this.users.get(userId).setProfile(profile);
    }

    public void sendConnectionRequest(User sender, User receiver) {
        Connections connections = new Connections(sender.getUserId(), receiver.getUserId());
        connections.setConnectionStatus(ConnectionStatus.NOT_ACCEPTED);
        sender.getConnections().add(connections);
        Notification notification = new Notification(String.valueOf(random.nextInt()), "Connection request received", String.format("%s sent the connection request, Please accept", sender.getName()), NotificationType.CONNECTION);
    }

    public void addJobPosting(Job posting) {
        this.jobPostings.put(posting.getJobId(), posting);
    }

    public List<Job> jobSearch(String term) {
        return this.jobPostings.values().stream().filter(item -> item.getDescription().contains(term) || item.getRequirements().contains(term) || item.getTitle().contains(term) || item.getLocation().contains(term)).toList();
    }

    private void addNotification(User reciever, Notification notification) {
        this.notifications.computeIfAbsent(reciever.getUserId(), k -> new ArrayList<>())
                .add(notification);
    }

    private void sendMessage(User sender, User receiver, String message) {
        Message message1 = new Message(String.valueOf(random.nextInt()), sender.getUserId(), receiver.getUserId(), message);
        sender.getSentMessages().add(message1);
        receiver.getInbox().add(message1);
    }

}
