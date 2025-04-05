package org.bala.SolidPrinciples.SingleResponsibility;

public class InvoiceRepository {
    public void saveInvoice(Invoice invoice) {
        System.out.println("Saving the invoice to databse");
    }
}
