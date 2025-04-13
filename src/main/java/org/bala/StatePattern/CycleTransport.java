package org.bala.StatePattern;

public class CycleTransport implements TransportationMode {
    @Override
    public int calcETA() {
        return 5;
    }

    @Override
    public String getDirections() {
        return "Cycle Transport";
    }
}
