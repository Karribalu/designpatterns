package org.bala.LLDProblems.CoffeeVendingMachine;

public class PaymentProcessor {
    public double charge(double bill, double paid) {
        if (paid < bill) {
            throw new IllegalArgumentException("Insufficient Funds");
        }
        return paid - bill;
    }
}
