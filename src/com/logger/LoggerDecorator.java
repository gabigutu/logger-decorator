package com.logger;

import java.io.IOException;

public class LoggerDecorator {

    ILogger logger;

    public LoggerDecorator(ILogger logger) {
        this.logger = logger;
    }

    public void logMessage(String message) throws IOException {
        this.logMessage(message, false);
    }

    public void logMessage(String message, boolean makeCopy) throws IOException {
        // daca logger e FileLogger.
        if (logger instanceof FileILogger) {
            ((FileILogger) logger).logMessage(message);
        } else if (logger instanceof DatabaseLogger) {
            ((DatabaseLogger) logger).insertMessage(message);
        } else if (logger instanceof EmailLogger) {
            ((EmailLogger) logger).emailMessage(message);
        }
        // altfel, data logger e DatabaseLogger
        if (makeCopy) {
            // ...
        }
    }

}
