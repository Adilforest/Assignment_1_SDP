package com.notification;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> recipients = Arrays.asList("user1@example.com", "user2@example.com", "user3@example.com");

        NotificationChannel emailNotification = new EmailNotification();
        BulkNotificationSender bulkEmailSender = new BulkNotificationSender(emailNotification);
        bulkEmailSender.sendBulkNotification("This is an email message.", recipients);

        NotificationChannel smsNotification = new SMSNotification();
        BulkNotificationSender bulkSmsSender = new BulkNotificationSender(smsNotification);
        bulkSmsSender.sendBulkNotification("This is an SMS message.", recipients);

        NotificationChannel pushNotification = new PushNotification();
        BulkNotificationSender bulkPushSender = new BulkNotificationSender(pushNotification);
        bulkPushSender.sendBulkNotification("This is a push notification message.", recipients);
    }
}
