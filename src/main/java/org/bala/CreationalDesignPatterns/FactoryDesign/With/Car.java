package org.bala.CreationalDesignPatterns.FactoryDesign.With;

public class Car implements Transport {
    @Override
    public void ride() {
        System.out.println("Transporting visa car");
    }
}
