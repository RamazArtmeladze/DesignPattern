package org.pattern.behavioral.strategy;

//Without the Strategy pattern, the different payment methods would likely be handled using conditional
// logic inside the PaymentProcessor class.


public class Main {
    public static void main(String[] args) {
        PaymentProcessor processor = new PaymentProcessor();

        // Pay using Credit Card
        processor.setPaymentStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        processor.processPayment(100.00);

        // Pay using PayPal
        processor.setPaymentStrategy(new PayPalPayment("user@example.com"));
        processor.processPayment(200.00);

        // Pay using Bank Transfer
        processor.setPaymentStrategy(new BankTransferPayment("ACC123456789"));
        processor.processPayment(300.00);
    }
}
