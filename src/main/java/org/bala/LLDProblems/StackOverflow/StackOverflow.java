package org.bala.LLDProblems.StackOverflow;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StackOverflow {
    Map<Integer, Question> questions;
    Map<Integer, Answer> answers;
    Map<Integer, Comment> comments;
    Map<Integer, Tag> tags;

    StackOverflow() {
        this.questions = new ConcurrentHashMap<>();
        this.answers = new ConcurrentHashMap<>();
        this.comments = new ConcurrentHashMap<>();
        this.tags = new ConcurrentHashMap<>();
    }

    public User createUser(String name, String email) {
        return new User(generateId(), name, email, 0);
    }

    public Question askQuestion(User user, String content, String title, List<Tag> tags) {
        Question question = new Question(title, content, user, LocalDateTime.now(), tags);
        user.addQuestion(question);
        questions.put(question.id, question);
        tags.forEach(item -> this.tags.put(item.getId(), item));
        return question;
    }

    public Answer answer(User user, Question question, String content) {
        Answer answer = new Answer(content, question);
        user.addAnswer(answer);
        return answer;
    }

    public Comment addComment(User user, Commentable commentable, String content) {
        Comment comment = new Comment(user, content);
        commentable.addComment(comment);
        user.addComment(comment);
        return comment;
    }

    public void voteQuestion(Question question, User user, int vote) {
        question.vote(user, vote);
    }

    public void voteAnswer(Answer answer, User user, int vote) {
        answer.vote(user, vote);
    }

    public void acceptAnswer(Answer answer) {
        answer.setAccepted(true);
    }

    public List<Question> getQuestionsByUser(User user) {
        return user.getQuestions();
    }

    public List<Question> searchByQuery(String query) {
        return this.questions.values().stream().filter(item -> item.title.contains(query)
                || item.tags.stream().anyMatch(tag -> tag.getValue().contains(query))
                || item.body.contains(query)).toList();
    }

    public Question getQuestionById(int id) {
        return questions.get(id);
    }

    public Answer getAnswerById(int id) {
        return this.answers.get(id);
    }

    public Comment getCommentById(int id) {
        return this.comments.get(id);
    }

    private int generateId() {
        return (int) (System.currentTimeMillis() % 100000);
    }
}
