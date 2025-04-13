package org.bala.StrategyPattern;

public class PaymentServiceII {

    public void processPayment(IPaymentStrategy paymentStrategy, int amount, String dest) {
        paymentStrategy.processPayment(dest, amount);
    }
}
