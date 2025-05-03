package org.bala.LLDProblems.Linkedin;

import java.time.LocalDateTime;

public class Message {
    private String id;
    private String senderId;
    private String receiverId;
    private String content;
    private LocalDateTime dateTime;

    public Message(String id, String senderId, String receiverId, String content) {
        this.id = id;
        this.senderId = senderId;
        this.receiverId = receiverId;
        this.content = content;
        this.dateTime = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getSenderId() {
        return senderId;
    }

    public String getReceiverId() {
        return receiverId;
    }

    public String getContent() {
        return content;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }
}
