package org.bala.StrategyPattern;

public class UPIPayment implements IPaymentStrategy {
    @Override
    public void processPayment(String dest, int amount) {
        System.out.println("UPI Payment being processed " + dest + " " + amount);
    }
}
