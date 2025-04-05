package org.bala.SolidPrinciples.DependencyInversionPrinciple.BadCode;

/**
 * This is a bad code as the NotificationService is directly dependent on the email service and smsServices
 */
public class NotificationService {
    private EmailService emailService;
    private SMSService smsService;

    public NotificationService() {
        this.emailService = new EmailService();
        this.smsService = new SMSService();
    }

    public void notifyByEmail(String msg) {
        this.emailService.sendEmail(msg);
    }

    public void notifyBySms(String msg) {
        this.smsService.sendSms(msg);
    }
}
