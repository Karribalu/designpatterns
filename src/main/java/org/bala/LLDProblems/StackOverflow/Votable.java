package org.bala.LLDProblems.StackOverflow;

public interface Votable {
    void vote(User user, int voteValue);
    int getVotes();
}
