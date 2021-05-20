package com.logger;

public class EmailLogger implements ILogger {

    private static EmailLogger emailLogger;

    private String address;
    private String to;
    private String from;

    private EmailLogger(String address, String to, String from) {
        this.address = address;
        this.to = to;
        this.from = from;
    }

    public static EmailLogger getInstance(String address, String to, String from) {
        if (emailLogger == null) {
            emailLogger = new EmailLogger(address, to, from);
        }
        return emailLogger;
    }

    public void emailMessage(String message) {
        System.out.println("Sending message " + message + " to " + to + " from " + from);
    }

}
