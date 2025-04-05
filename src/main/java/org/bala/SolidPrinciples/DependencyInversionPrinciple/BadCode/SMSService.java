package org.bala.SolidPrinciples.DependencyInversionPrinciple.BadCode;

public class SMSService {
    public void sendSms(String ms) {
        System.out.println("Sending SMS.. " + ms);
    }
}
