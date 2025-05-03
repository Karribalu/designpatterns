package org.bala.LLDProblems.LogginFramework;

public class Logger {
    private static Logger instance;
    private LogConfiguration configuration;

    private Logger(LogConfiguration configuration) {
        this.configuration = configuration;
    }

    public static synchronized Logger getInstance(LogConfiguration configuration) {
        if (instance == null) {
            instance = new Logger(configuration);
        }
        return instance;
    }

    public void log(LogLevel logLevel, String message) {
        if (logLevel.ordinal() >= configuration.getLogLevel().ordinal()) {
            LogMessage logMessage = new LogMessage(logLevel, message);
            configuration.getAppenders().forEach(appender -> appender.append(logMessage));
        }
    }

    public void debug(String message) {
        this.log(LogLevel.DEBUG, message);
    }

    public void info(String message) {
        this.log(LogLevel.INFO, message);
    }

    public void error(String message) {
        this.log(LogLevel.ERROR, message);
    }

    public void fatal(String message) {
        this.log(LogLevel.FATAL, message);
    }
}
