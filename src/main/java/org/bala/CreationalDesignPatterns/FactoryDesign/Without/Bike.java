package org.bala.CreationalDesignPatterns.FactoryDesign.Without;

public class Bike implements Transport {
    @Override
    public void ride() {
        System.out.println("Transporting visa Bike");
    }
}
