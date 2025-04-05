package org.bala.SolidPrinciples.OpenClosed;

public class CreditCardPayment implements IPaymentMethod{
    @Override
    public void pay(String source, String dest, int amount) {
        System.out.println("Paying via credit card");
    }
}
