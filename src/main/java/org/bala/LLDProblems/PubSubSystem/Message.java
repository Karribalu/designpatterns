package org.bala.LLDProblems.PubSubSystem;

import java.time.LocalDateTime;
import java.util.concurrent.atomic.AtomicInteger;

public class Message {
    static AtomicInteger idGenerator = new AtomicInteger(0);

    private int id;
    String content;
    private LocalDateTime localDateTime;

    Message(String c) {
        this.id = idGenerator.incrementAndGet();
        this.localDateTime = LocalDateTime.now();
        content = c;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }
}
