package org.bala.StrategyPattern;

public class CreditCardPayment implements IPaymentStrategy {
    @Override
    public void processPayment(String dest, int amount) {
        System.out.println("Credit Payment being processed " + dest + " " + amount);
    }
}
