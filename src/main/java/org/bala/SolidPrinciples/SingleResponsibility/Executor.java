package org.bala.SolidPrinciples.SingleResponsibility;

public class Executor {
    public void run() {
        Invoice invoice = new Invoice();
        invoice.item = "Item 1";
        EmailService service = new EmailService();
        service.sendEmail("1@gmail.com", invoice);
        InvoiceRepository repository = new InvoiceRepository();
        repository.saveInvoice(invoice);
    }
}
