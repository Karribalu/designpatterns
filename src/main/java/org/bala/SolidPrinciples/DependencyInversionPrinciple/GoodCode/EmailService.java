package org.bala.SolidPrinciples.DependencyInversionPrinciple.GoodCode;

public class EmailService implements NotificationChannel{
    public void notify(String msg){
        System.out.println("Notifying via email "+msg);
    }
}
