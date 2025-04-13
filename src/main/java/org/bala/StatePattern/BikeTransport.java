package org.bala.StatePattern;

public class BikeTransport implements TransportationMode{
    @Override
    public int calcETA() {
        return 3    ;
    }

    @Override
    public String getDirections() {
        return "Bike Mode ";
    }
}
