package org.bala.StrategyPattern;

public interface IPaymentStrategy {
    void processPayment(String dest, int amount);
}
