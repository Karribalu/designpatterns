package org.bala.SolidPrinciples.DependencyInversionPrinciple.BadCode;

public class EmailService {
    public void sendEmail(String msg) {
        System.out.println("Sending the message " + msg);
    }
}
