package org.bala.SolidPrinciples.OpenClosed;

/**
 * The functionality should be open for extension but closed for modification unless necessary
 */
public class OpenClosed {
    public void run() {
        PaymentProcessor processor = new PaymentProcessor();
        IPaymentMethod paymentMethod = new DebitCardPayment();
        processor.processPayment(paymentMethod, "bala","shiva", 20);
        processor.processPayment(new UPIPayment(), "bala", "shiva", 50);
    }
}
