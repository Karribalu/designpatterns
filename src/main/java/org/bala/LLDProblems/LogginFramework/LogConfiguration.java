package org.bala.LLDProblems.LogginFramework;

import java.util.List;

public class LogConfiguration {
    private LogLevel logLevel;
    private final List<Appender> appenders;

    LogConfiguration(LogLevel logLevel, List<Appender> appenders) {
        this.logLevel = logLevel;
        this.appenders = appenders;
    }

    public void setLogLevel(LogLevel level) {
        this.logLevel = level;
    }

    public LogLevel getLogLevel() {
        return this.logLevel;
    }

    public void addAppender(Appender appender) {
        this.appenders.add(appender);
    }

    public List<Appender> getAppenders() {
        return this.appenders;
    }
}
