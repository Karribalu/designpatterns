package org.bala.LLDProblems.VendingMachine;

public class PaymentProcessor {
    private double balance = 0.0;

    public void insert(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            throw new UnsupportedOperationException("Insufficient funds");
        }
        balance -= amount;
    }

    public void reset() {
        this.balance = 0.0;
    }

    public double getBalance() {
        return this.balance;
    }
}
