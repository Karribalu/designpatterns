package org.bala.LLDProblems.PubSubSystem;

import java.util.concurrent.atomic.AtomicInteger;

public class Subscriber implements ISubscriber {
    private static final AtomicInteger idGen = new AtomicInteger(0);
    private final int id;

    Subscriber() {
        this.id = idGen.incrementAndGet();
    }

    @Override
    public synchronized void onMessage(Message message) {
        System.out.println("Received message to Subscriber " + this.id + " message: " + message.content);
    }

    @Override
    public String getId() {
        return String.valueOf(id);
    }
}
