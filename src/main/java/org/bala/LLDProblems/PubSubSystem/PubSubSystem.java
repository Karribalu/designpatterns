package org.bala.LLDProblems.PubSubSystem;

import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class PubSubSystem {
    private Map<String, Set<ISubscriber>> topicSubscribers = new ConcurrentHashMap<>();
    private final ExecutorService executorService;
    private static PubSubSystem instance;

    private PubSubSystem() {
        this.executorService = Executors.newCachedThreadPool();
        this.topicSubscribers = new ConcurrentHashMap<>();
    }

    public static PubSubSystem getInstance() {
        if (instance == null) {
            instance = new PubSubSystem();
        }
        return instance;
    }

    public void addSubscription(String topicName, ISubscriber subscriber) {
        topicSubscribers.computeIfAbsent(topicName, k -> new CopyOnWriteArraySet<>())
                .add(subscriber);
    }

    public void sendMessage(String topicName, Message message) {
        if (this.topicSubscribers.containsKey(topicName)) {
            Set<ISubscriber> subscribers = this.topicSubscribers.get(topicName);
            for (var sub : subscribers) {
                this.executorService.submit(() -> deliverMessage(sub, message));
            }
            System.out.println("Message sent to subscribers of size " + subscribers.size());
        } else {
            System.out.println("Topic does not exist and message is not delivered ");
        }
    }

    public void removeSubscription(String topic, ISubscriber subscriber) {
        Set<ISubscriber> subscribers = this.topicSubscribers.get(topic);

        if (subscribers != null) {
            subscribers.remove(subscriber);
            System.out.println("Subscriber " + subscriber.getId() + " removed from topic " + topic);

            if (subscribers.isEmpty()) {
                System.out.println("Topic has no subscribers, Hence deleting " + topic);
                this.topicSubscribers.remove(topic);
            }
        }
    }

    private void deliverMessage(ISubscriber subscriber, Message message) {
        try {
            subscriber.onMessage(message);
        } catch (Exception e) {
            System.out.println("Message deliver failed to " + subscriber.getId() + "Message " + message.getId());
        }
    }


}
