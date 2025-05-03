package org.bala.LLDProblems.LogginFramework;

public class ConsoleAppender implements Appender {
    @Override
    public void append(LogMessage message) {
        System.out.println("Console: " + message.format());
    }
}
