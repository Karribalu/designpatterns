package org.bala.LLDProblems.StackOverflow;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Question implements Votable, Commentable {
    int id;
    String title;
    String body;
    User author;
    LocalDateTime createdAt;
    List<Vote> votes;
    List<Answer> answers;
    List<Comment> comments;
    List<Tag> tags;

    Question(String title, String body, User author, LocalDateTime createdAt, List<Tag> tags) {
        this.id = generateId();
        this.title = title;
        this.body = body;
        this.author = author;
        this.createdAt = createdAt;
        this.comments = new ArrayList<>();
        this.answers = new ArrayList<>();
        this.tags = tags;
    }

    @Override
    public void vote(User user, int voteValue) {
        if (voteValue != 1 && voteValue != -1) {
            throw new IllegalArgumentException("Vote value must be 1 (upvote) or -1 (downvote)");
        }
        if (user == null) {
            throw new IllegalArgumentException("User cannot be null");
        }
        for (Vote vote : votes) {
            if (vote.getUser().equals(user)) {
                // User has already voted, update the vote value
                vote.voteValue = voteValue;
                return;
            }
        }
        // User has not voted yet, add a new vote
        Vote newVote = new Vote(user, voteValue);
        votes.add(newVote);
    }

    @Override
    public int getVotes() {
        return votes.stream()
                .mapToInt(Vote::getVoteValue)
                .sum();
    }

    private int generateId() {
        return (int) (System.currentTimeMillis() % 100000);
    }

    public void addAnswer(Answer answer) {
        if (answer == null) {
            throw new UnsupportedOperationException("Answer cannot be null");
        }
        if (!this.answers.contains(answer))
            this.answers.add(answer);
    }

    public void addComment(Comment comment) {
        this.comments.add(comment);
    }

    @Override
    public List<Comment> getComments() {
        return this.comments;
    }
}
