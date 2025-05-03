package org.bala.LLDProblems.LogginFramework;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FileAppender implements Appender {
    private final BufferedWriter writer;

    FileAppender(String filePath) throws IOException {
        this.writer = new BufferedWriter(new FileWriter(filePath, true));
    }

    @Override
    public synchronized void append(LogMessage message) {
        try {
            writer.write(message.format());
            writer.newLine();
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
