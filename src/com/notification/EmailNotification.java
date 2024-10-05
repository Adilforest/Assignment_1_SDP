package com.notification;

public class EmailNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Email to " + recipient + ": " + message);
    }
}
