package org.bala.SolidPrinciples.DependencyInversionPrinciple.GoodCode;

public class NotificationService {
    public NotificationChannel notificationChannel;
    public NotificationService(NotificationChannel channel){
        notificationChannel = channel;
    }

    public void notify(String msg){
        this.notificationChannel.notify(msg);
    }
}
