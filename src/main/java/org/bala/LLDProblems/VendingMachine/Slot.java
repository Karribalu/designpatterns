package org.bala.LLDProblems.VendingMachine;

import java.util.concurrent.atomic.AtomicInteger;

public class Slot {
    private Product product;
    private AtomicInteger quantity;

    public Slot(Product product, AtomicInteger quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public AtomicInteger getQuantity() {
        return quantity;
    }

    public void setQuantity(AtomicInteger quantity) {
        this.quantity = quantity;
    }

    public void decrement() {
        this.quantity.decrementAndGet();
    }

    public void addStock(int qty) {
        this.quantity.addAndGet(qty);
    }
}
