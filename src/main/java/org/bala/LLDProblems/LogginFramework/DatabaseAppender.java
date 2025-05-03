package org.bala.LLDProblems.LogginFramework;

public class DatabaseAppender implements Appender {
    @Override
    public void append(LogMessage message) {
        System.out.println("Database: " + message.format());
    }
}
