package org.bala.LLDProblems.StackOverflow;

import java.util.ArrayList;
import java.util.List;

public class User {
    Integer id;
    String name;
    String email;
    int reputation;
    List<Question> questions;
    List<Answer> answers;
    List<Comment> comments;
    private static final int QUESTION_REPUTATION = 5;
    private static final int ANSWER_REPUTATION = 10;
    private static final int COMMENT_REPUTATION = 2;

    public User(Integer id, String name, String email, int reputation) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.reputation = reputation;
        this.answers = new ArrayList<>();
        this.questions = new ArrayList<>();
        this.comments = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        this.questions.add(question);
        this.updateReputation(QUESTION_REPUTATION);
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
        this.updateReputation(COMMENT_REPUTATION);
    }

    public void addAnswer(Answer answer) {
        this.answers.add(answer);
        this.updateReputation(ANSWER_REPUTATION);
    }

    public int getReputation() {
        return this.reputation;
    }

    public synchronized void updateReputation(int value) {
        this.reputation += value;
    }

    public List<Question> getQuestions() {
        return this.questions;
    }
}
