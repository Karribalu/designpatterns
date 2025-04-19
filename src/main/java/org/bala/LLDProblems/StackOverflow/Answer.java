package org.bala.LLDProblems.StackOverflow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Answer implements Votable, Commentable {
    int id;
    String content;
    List<Vote> votes;
    User author;
    Question question;
    LocalDateTime createdAt;
    List<Comment> comments;
    boolean isAccepted;

    Answer(String content, Question question) {
        this.id = generateId();
        this.comments = new ArrayList<>();
        this.content = content;
        this.question = question;
        this.createdAt = LocalDateTime.now();
    }

    @Override
    public void vote(User user, int voteValue) {
        if (voteValue != -1 && voteValue != 1) {
            throw new UnsupportedOperationException("Vote value must be 1 (upvote) or -1 (downvote)");
        }
        for (Vote vote : votes) {
            if (vote.getUser() == user) {
                vote.voteValue = voteValue;
                return;
            }
        }
        Vote vote = new Vote(user, voteValue);
        this.votes.add(vote);
    }

    @Override
    public int getVotes() {
        return this.votes.stream()
                .mapToInt(Vote::getVoteValue)
                .sum();
    }

    @Override
    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    @Override
    public List<Comment> getComments() {
        return this.comments;
    }

    private int generateId() {
        return (int) System.currentTimeMillis() % 100000;
    }

    public void setAccepted(boolean val) {
        this.isAccepted = true;
    }
}
