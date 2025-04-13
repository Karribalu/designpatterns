package org.bala.StrategyPattern;

class PaymentService {
    public void processPayment(String paymentMethod) {
        if (paymentMethod.equals("credit")) {
            System.out.println("Paying via credit");
        } else if (paymentMethod.equals("debit")) {
            System.out.println("Paying via debit");
        } else {
            System.out.println("Payment system not supported");
        }
    }
}

public class WithoutStrategyPattern {
    public static void main(String[] args) {
        PaymentService paymentService = new PaymentService();
        paymentService.processPayment("debit");
    }
}
