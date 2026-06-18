# Software Design Patterns — Assignment 1 (AITU)

![Java](https://img.shields.io/badge/Java-21-007396?logo=openjdk&logoColor=white)

## Overview

Two standalone tasks that demonstrate the **SOLID principles** in plain Java.
The assignment is part of the *Software Design Patterns* course at Astana IT University.

- **Task 1 — Payment Processing System:** a small payment pipeline that accepts any payment method through a common interface, making it trivial to add new methods without touching existing code.
- **Task 2 — Notification System:** a multi-channel notification dispatcher (SMS, Email, Push, Slack) that also supports bulk delivery to a list of recipients.

## Principles / Concepts implemented

- **Single Responsibility Principle (SRP)** — each class does exactly one thing: `CreditCardPayment` handles credit-card logic; `PaymentProcessor` handles dispatching; `BulkNotificationSender` handles iteration over recipients.
- **Open/Closed Principle (OCP)** — new payment methods (`BankTransferPayment`) and notification channels (`SlackNotification`) are added by implementing an interface, without modifying any existing class.
- **Liskov Substitution Principle (LSP)** — `PaymentProcessor` accepts any `PaymentMethod`; `BulkNotificationSender` accepts any `NotificationChannel`; all concrete implementations are interchangeable at those injection points.
- **Interface Segregation Principle (ISP)** — `PaymentMethod` exposes a single method (`processPayment`); `NotificationChannel` exposes a single method (`sendNotification`). No class is forced to implement methods it doesn't need.
- **Dependency Inversion Principle (DIP)** — high-level modules (`PaymentProcessor`, `BulkNotificationSender`) depend on abstractions (interfaces), not on concrete implementations.
- **Polymorphism via interfaces** — concrete classes (`CreditCardPayment`, `SMSNotification`, etc.) are treated uniformly through their interface type at call sites.

## Project structure

```
src/
├── com/payment/
│   ├── PaymentMethod.java          # interface: processPayment(double)
│   ├── CreditCardPayment.java      # implements PaymentMethod
│   ├── PayPalPayment.java          # implements PaymentMethod
│   ├── BankTransferPayment.java    # implements PaymentMethod
│   ├── PaymentProcessor.java       # dispatches to any PaymentMethod
│   └── Main.java                   # demo: runs all three payment types
│
└── com/notification/
    ├── NotificationChannel.java    # interface: sendNotification(String, String)
    ├── SMSNotification.java        # implements NotificationChannel
    ├── EmailNotification.java      # implements NotificationChannel
    ├── PushNotification.java       # implements NotificationChannel
    ├── SlackNotification.java      # implements NotificationChannel
    ├── BulkNotificationSender.java # sends one message to a list of recipients
    └── Main.java                   # demo: bulk email, SMS, and push
```

## How to run

### Via command line (JDK 21+)

**Task 1 — Payment:**
```bash
cd src
javac com/payment/*.java
java com.payment.Main
```

**Task 2 — Notification:**
```bash
cd src
javac com/notification/*.java
java com.notification.Main
```

### Via IntelliJ IDEA

1. Open the project root in IntelliJ IDEA.
2. The SDK is pre-configured to JDK 21 (see `.idea/misc.xml`).
3. Open either `com/payment/Main.java` or `com/notification/Main.java` and click **Run**.

---

Adil Ormanov — [GitHub](https://github.com/Adilforest)
