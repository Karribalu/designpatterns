package org.bala.LLDProblems.StackOverflow;

public class Vote {
    User user;
    int voteValue;

    public Vote(User user, int voteValue) {
        this.user = user;
        this.voteValue = voteValue;
    }

    public User getUser() {
        return user;
    }

    public int getVoteValue() {
        return voteValue;
    }
}
