package com.logger;

import java.io.IOException;

public class Main {

    // Design Pattern: Decorator

    private static void testLogMessage() throws IOException {
//        DatabaseLogger logger = DatabaseLogger.getInstance("username", "password", "url");
//        logger.insertMessage("A new request has been performed");

//        ILogger logger = FileILogger.getInstance("requests.log");
        ILogger logger = EmailLogger.getInstance("server.com", "test@email.com", "no-reply@server.com");
        LoggerDecorator loggerDecorator = new LoggerDecorator(logger);
        loggerDecorator.logMessage("A new request has been performed (with decorator)");
    }

    public static void main(String[] args) {
        // fisier
        // email
        // baza de date

        try {
            Main.testLogMessage();
        } catch (IOException exception) {
            exception.printStackTrace();
        }


    }
}
