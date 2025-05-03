package org.bala.LLDProblems.LogginFramework;

import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        Appender console = new ConsoleAppender();
        Appender file = new FileAppender("/Users/balasubramanyam/Learning/designpatterns/src/main/java/org/bala/LLDProblems/LogginFramework/log.txt");
        LogConfiguration logConfiguration = new LogConfiguration(LogLevel.DEBUG, List.of(console, file));

        Logger logger = Logger.getInstance(logConfiguration);

        logger.info("Hello I am info");
        logger.debug("Hello I am debug");
        logger.error("Hello I am Error!");
        logger.fatal("Hello I am fatal");
    }
}
