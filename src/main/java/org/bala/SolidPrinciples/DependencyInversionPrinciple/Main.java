package org.bala.SolidPrinciples.DependencyInversionPrinciple;

import org.bala.SolidPrinciples.DependencyInversionPrinciple.GoodCode.EmailService;
import org.bala.SolidPrinciples.DependencyInversionPrinciple.GoodCode.NotificationChannel;
import org.bala.SolidPrinciples.DependencyInversionPrinciple.GoodCode.NotificationService;
import org.bala.SolidPrinciples.DependencyInversionPrinciple.GoodCode.SMSService;

public class Main {
    public static void main(String[] args) {
        NotificationChannel smsService = new SMSService();
        NotificationService notificationService = new NotificationService(smsService);
        notificationService.notify("Hello SMS");

        NotificationChannel emailChannel = new EmailService();
        notificationService = new NotificationService(emailChannel);
        notificationService.notify("Hello Email");
    }
}
