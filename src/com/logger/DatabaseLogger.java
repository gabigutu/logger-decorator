package com.logger;

public class DatabaseLogger implements ILogger {

    private static DatabaseLogger databaseLogger = null;
    private String username;
    private String password;
    private String url;

    private DatabaseLogger(String username, String password, String url) {
        this.username = username;
        this.password = password;
        this.url = url;
    }

    public static DatabaseLogger getInstance(String username, String password, String url) {
        if (databaseLogger == null) {
            databaseLogger = new DatabaseLogger(username, password, url);
        }
        return databaseLogger;
    }

    public void insertMessage(String message) {
        System.out.println("Logging message to database: " + message);
    }

}
