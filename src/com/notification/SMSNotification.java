package com.notification;

public class SMSNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to " + recipient + ": " + message);
    }
}
