package org.bala.SolidPrinciples.OpenClosed;

public class PaymentProcessor {
    public void processPayment(IPaymentMethod paymentMethod, String source, String dest, int amount) {
        System.out.println("Payment being processed " + amount);
        paymentMethod.pay(source, dest, amount);
    }
}
