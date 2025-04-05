package org.bala.SolidPrinciples.DependencyInversionPrinciple.GoodCode;

public class SMSService implements NotificationChannel{
    @Override
    public void notify(String msg) {
        System.out.println("Notifying via sms "+msg);
    }
}
