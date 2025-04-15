package org.bala.CreationalDesignPatterns.FactoryDesign.Without;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Transporting visa bus");
    }
}
