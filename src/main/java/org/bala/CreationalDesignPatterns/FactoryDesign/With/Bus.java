package org.bala.CreationalDesignPatterns.FactoryDesign.With;

public class Bus implements Transport {
    @Override
    public void ride() {
        System.out.println("Transporting visa bus");
    }
}
