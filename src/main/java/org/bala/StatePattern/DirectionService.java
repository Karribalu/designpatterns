package org.bala.StatePattern;

public class DirectionService {
    private TransportationMode transportationMode;

    DirectionService(TransportationMode mode) {
        this.transportationMode = mode;
    }

    public void setTransportationMode(TransportationMode transportationMode) {
        this.transportationMode = transportationMode;
    }

    public int getEta() {
        return this.transportationMode.calcETA();
    }

    public String getDirections() {
        return this.transportationMode.getDirections();
    }
}
