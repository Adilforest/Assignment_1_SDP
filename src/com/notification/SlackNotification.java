package com.notification;

public class SlackNotification implements NotificationChannel {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Slack notification to " + recipient + ": " + message);
    }
}
