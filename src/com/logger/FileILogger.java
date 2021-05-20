package com.logger;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileILogger implements ILogger {

    String fileName;
    private static FileILogger fileLogger = null;

    private FileILogger(String filename) {
        this.fileName = filename;
    }

    public static FileILogger getInstance(String filename) {
        if (fileLogger == null) {
            fileLogger = new FileILogger(filename);
        }
        return fileLogger;
    }

    public void logMessage(String message) throws IOException {
        PrintWriter printWriter = new PrintWriter(new FileWriter(this.fileName));
        printWriter.println(message);
        printWriter.flush();
        printWriter.close();
    }


}
