# SOLID Principles Assignment

**Course Name**: Software Design Patterns  
---

## Task 1: Payment Processing System

### Objective
The goal is to build a flexible and maintainable payment processing system that can handle various payment methods and allow for easy addition of new methods without modifying the existing code.

### Requirements
1. The system should handle at least two payment methods: `CreditCardPayment` and `PayPalPayment`.
2. The system should be easily extendable, allowing the addition of new payment methods (e.g., `BankTransferPayment`) without modifying the existing code.
3. The solution should follow SOLID principles, focusing on:
   - Single Responsibility Principle (SRP)
   - Open/Closed Principle (OCP)
   - Dependency Inversion Principle (DIP)
   - Interface Segregation Principle (ISP)
   - Liskov Substitution Principle (LSP)

### Solution Structure
- **PaymentMethod Interface**: A unified interface for all payment types.
- **CreditCardPayment Class**: Handles payments via credit cards.
- **PayPalPayment Class**: Handles payments via PayPal.
- **BankTransferPayment Class**: Handles payments via bank transfers (easily extendable).
- **PaymentProcessor Class**: A processor that takes any `PaymentMethod` and processes the payment.

### How to Run
1. Clone the repository.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).
3. Navigate to `Main.java` and run the program.
4. Observe the different payment methods being processed.

---

## Task 2: Notification System

### Objective
The task is to develop a notification system that supports sending notifications via multiple channels (SMS, Email, Push Notification). The system should allow for easy extension by adding new types of notifications and should also support bulk notifications to multiple users.

### Requirements
1. The system should support at least three notification types: `SMSNotification`, `EmailNotification`, and `PushNotification`.
2. The system should allow easy addition of new notification types (e.g., `SlackNotification`) without modifying existing code.
3. The system should support sending bulk notifications to multiple users.
4. The solution should follow SOLID principles:
   - Single Responsibility Principle (SRP)
   - Open/Closed Principle (OCP)
   - Dependency Inversion Principle (DIP)

### Solution Structure
- **NotificationChannel Interface**: A unified interface for all notification channels.
- **SMSNotification Class**: Sends notifications via SMS.
- **EmailNotification Class**: Sends notifications via Email.
- **PushNotification Class**: Sends notifications via Push notifications.
- **BulkNotificationSender Class**: Sends notifications to multiple recipients via any notification channel.
  
### How to Run
1. Clone the repository.
2. Open the project in your preferred IDE (e.g., IntelliJ IDEA).
3. Navigate to `Main.java` and run the program.
4. Test sending notifications via different channels and observe the results in the console.

---

## Design Principles Applied
1. **Single Responsibility Principle (SRP)**: Each class has a single responsibility.
2. **Open/Closed Principle (OCP)**: The system allows for new features (new payment methods, new notification types) without modifying existing classes.
3. **Liskov Substitution Principle (LSP)**: Derived classes (`CreditCardPayment`, `PayPalPayment`, `SMSNotification`, etc.) can replace their base class without altering the correct functionality of the system.
4. **Interface Segregation Principle (ISP)**: Interfaces are small and specific to avoid forcing classes to implement unnecessary methods.
5. **Dependency Inversion Principle (DIP)**: High-level modules (`PaymentProcessor`, `BulkNotificationSender`) depend on abstractions (`PaymentMethod`, `NotificationChannel`), not on low-level modules.

---

## How to Extend the System
- **Adding a new Payment Method**: Create a new class implementing the `PaymentMethod` interface and provide the payment logic.
- **Adding a new Notification Type**: Create a new class implementing the `NotificationChannel` interface and define how the notification is sent.

Feel free to clone this repository and add your custom implementations to extend the system without altering the existing code!

---
