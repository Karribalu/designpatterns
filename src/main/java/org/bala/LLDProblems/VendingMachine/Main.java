package org.bala.LLDProblems.VendingMachine;

import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        VendingMachine vendingMachine = VendingMachine.getInstance();
        ProductRepository productRepository = vendingMachine.getProductRepository();
        MaintenanceService maintenanceService = new MaintenanceService();

        productRepository.addSlot(new Slot(new Product(1, 10), new AtomicInteger(10)));
        productRepository.addSlot(new Slot(new Product(2, 10), new AtomicInteger(1)));

        // select the product
        vendingMachine.selectProduct(2);
        vendingMachine.insertMoney(Note.TEN);
        vendingMachine.dispense();

        vendingMachine.selectProduct(2);
        vendingMachine.insertMoney(Note.TEN);
        vendingMachine.dispense();

    }
}
