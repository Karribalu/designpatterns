package org.bala.SolidPrinciples.OpenClosed;

public interface IPaymentMethod {
    void pay(String source, String dest, int amount);
}
