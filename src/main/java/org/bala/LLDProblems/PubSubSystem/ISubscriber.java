package org.bala.LLDProblems.PubSubSystem;

public interface ISubscriber {
    void onMessage(Message message);

    String getId();
}
