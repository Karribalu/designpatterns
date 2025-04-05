package org.bala.SolidPrinciples.SingleResponsibility;

public class EmailService {
    public void sendEmail(String email, Invoice invoice) {
        System.out.println("Email is being sent to " + email);
    }
}
