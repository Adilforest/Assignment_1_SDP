package com.payment;

public class Main {
    public static void main(String[] args) {
        PaymentMethod creditCardPayment = new CreditCardPayment();
        PaymentProcessor processor = new PaymentProcessor(creditCardPayment);
        processor.process(100.0);

        PaymentMethod payPalPayment = new PayPalPayment();
        processor = new PaymentProcessor(payPalPayment);
        processor.process(200.0);

        PaymentMethod bankTransferPayment = new BankTransferPayment();
        processor = new PaymentProcessor(bankTransferPayment);
        processor.process(300.0);
    }
}
