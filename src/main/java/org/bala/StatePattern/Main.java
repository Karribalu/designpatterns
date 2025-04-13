package org.bala.StatePattern;

public class Main {
    public static void main(String[] args) {
        TransportationMode cycle = new CycleTransport();
        DirectionService directionService = new DirectionService(cycle);
        System.out.println(directionService.getDirections());
        System.out.println(directionService.getEta());

        directionService.setTransportationMode(new BikeTransport());
        System.out.println(directionService.getDirections());
        System.out.println(directionService.getEta());
    }
}
