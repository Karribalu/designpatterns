package org.bala.CreationalDesignPatterns.FactoryDesign.With;

public class Main {
    public static void main(String[] args) {
        Transport car = TransportFactory.createTransport("car");
        Transport bus = TransportFactory.createTransport("bus");
        Transport bike = TransportFactory.createTransport("bike");

        car.ride();
        bike.ride();
        bus.ride();
    }
}
