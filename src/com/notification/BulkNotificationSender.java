package com.notification;

import java.util.List;

public class BulkNotificationSender {
    private NotificationChannel notificationChannel;

    public BulkNotificationSender(NotificationChannel notificationChannel) {
        this.notificationChannel = notificationChannel;
    }

    public void sendBulkNotification(String message, List<String> recipients) {
        for (String recipient : recipients) {
            notificationChannel.sendNotification(message, recipient);
        }
    }
}
