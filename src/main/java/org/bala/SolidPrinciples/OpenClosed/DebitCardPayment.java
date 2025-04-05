package org.bala.SolidPrinciples.OpenClosed;

public class DebitCardPayment implements IPaymentMethod {
    @Override
    public void pay(String source, String dest, int amount) {
        System.out.println("Paying via debit card");
    }
}
