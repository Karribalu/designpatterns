package org.bala.LLDProblems.PubSubSystem;

public class Main {
    public static void main(String[] args) {
        PubSubSystem subSystem = PubSubSystem.getInstance();

        ISubscriber subscriberOne = new Subscriber();
        ISubscriber subscriberTwo = new Subscriber();
        ISubscriber subscriberThree = new Subscriber();

        subSystem.addSubscription("General", subscriberOne);
        subSystem.addSubscription("Sports", subscriberTwo);
        subSystem.addSubscription("Sports", subscriberThree);

        subSystem.sendMessage("General", new Message("Hello Everyonne "));
        subSystem.sendMessage("Sports", new Message("Hello Sports Groups "));

        subSystem.removeSubscription("Sports", subscriberThree);

        subSystem.sendMessage("Sports", new Message("Good Morning"));
    }
}
