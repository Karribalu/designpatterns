package org.bala.LLDProblems.LogginFramework;

import java.time.LocalDateTime;
import java.util.Collections;

public class LogMessage {
    private final LogLevel logLevel;
    private final LocalDateTime dateTime;
    private final String message;

    public LogMessage(LogLevel logLevel, String message) {
        this.logLevel = logLevel;
        this.dateTime = LocalDateTime.now();
        this.message = message;
    }

    public String format() {
        return String.format("%s | %s | %s", dateTime, logLevel, message);

    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }
}
