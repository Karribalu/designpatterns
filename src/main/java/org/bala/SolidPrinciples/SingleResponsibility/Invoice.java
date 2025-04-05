package org.bala.SolidPrinciples.SingleResponsibility;

public class Invoice {
    String item;
    private void createInvoice() {
        System.out.println("Invoice is being created for " + item);
    }
}
