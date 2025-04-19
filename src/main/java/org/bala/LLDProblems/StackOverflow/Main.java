package org.bala.LLDProblems.StackOverflow;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        StackOverflow stackOverflow = new StackOverflow();
        User user1 = stackOverflow.createUser("Bala", "bala@gmail.com");
        User user2 = stackOverflow.createUser("shiva", "shiva@gmail.com");
        Tag tag1 = new Tag("Help");
        Tag tag2 = new Tag("Programming");
        Question question = stackOverflow.askQuestion(user1, "I need help", "Some help please", List.of(tag1));

        Answer answer = stackOverflow.answer(user2, question, "I can help");

        System.out.println(user1.getReputation());
        System.out.println(user2.getReputation());
    }
}
