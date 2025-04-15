package org.bala.CreationalDesignPatterns.FactoryDesign.Without;

public class Main {
    public static void main(String[] args) {
        Transport bus = new Bus();
        Transport car = new Car();
        Transport bike = new Bike();
        // The client is tighly coupled with the classes, We will need a factory 
    }
}
