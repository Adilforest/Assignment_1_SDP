package com.notification;

public class PushNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Push Notification to " + recipient + ": " + message);
    }
}
