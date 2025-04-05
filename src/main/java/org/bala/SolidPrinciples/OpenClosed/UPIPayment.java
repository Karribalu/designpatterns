package org.bala.SolidPrinciples.OpenClosed;

public class UPIPayment implements IPaymentMethod{
    @Override
    public void pay(String source, String dest, int amount) {
        System.out.println("Paying via UPI");
    }
}
