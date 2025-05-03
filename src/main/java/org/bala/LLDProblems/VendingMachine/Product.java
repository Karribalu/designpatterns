package org.bala.LLDProblems.VendingMachine;

public class Product {
    private Integer id;
    private double price;

    public Product(Integer id, double price) {
        this.id = id;
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
