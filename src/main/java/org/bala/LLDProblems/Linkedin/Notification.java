package org.bala.LLDProblems.Linkedin;

import java.time.LocalDateTime;

public class Notification {
    private String id;
    private String title;
    private String content;
    private NotificationType notificationType;
    private LocalDateTime timestamp;

    public Notification(String id, String title, String content, NotificationType notificationType) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.notificationType = notificationType;
        this.timestamp = LocalDateTime.now();
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getContent() {
        return content;
    }

    public NotificationType getNotificationType() {
        return notificationType;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }
}
