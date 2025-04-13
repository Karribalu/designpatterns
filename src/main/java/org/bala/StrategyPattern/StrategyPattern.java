package org.bala.StrategyPattern;

public class StrategyPattern {
    public static void main(String[] args) {
        CreditCardPayment creditCardPayment = new CreditCardPayment();
        UPIPayment upiPayment = new UPIPayment();
        PaymentServiceII paymentServiceII = new PaymentServiceII();
        paymentServiceII.processPayment(creditCardPayment, 10, "bala");
        paymentServiceII.processPayment(upiPayment, 50, "shiva");
    }
}
