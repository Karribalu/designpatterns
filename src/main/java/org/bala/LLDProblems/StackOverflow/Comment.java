package org.bala.LLDProblems.StackOverflow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Comment {
    int id;
    User author;
    String content;
    List<Comment> replies;
    LocalDateTime createdAt;

    public Comment(User author, String content) {
        this.id = generateId();
        this.author = author;
        this.content = content;
        this.replies = new ArrayList<>();
        this.createdAt = LocalDateTime.now();
    }

    private int generateId() {
        return (int) (System.currentTimeMillis() % 100000);
    }

    public void addReply(Comment comment) {
        this.replies.add(comment);
    }
}
