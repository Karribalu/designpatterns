package org.bala.StatePattern;

enum TransportationModeII {
    WALKING,
    BIKING,
    DRIVING
}

class DirectionServiceII {
    private TransportationModeII transportationMode;

    DirectionServiceII(TransportationModeII mode) {
        this.transportationMode = mode;
    }

    public void setTransportationMode(TransportationModeII mode) {
        this.transportationMode = mode;
    }

    public int getETA() {
        return switch (transportationMode) {
            case WALKING -> 10;
            case BIKING -> 5;
            case DRIVING -> 3;
        };
    }
}

public class WithoutPattern {
    public static void main(String[] args) {
        DirectionServiceII directionService = new DirectionServiceII(TransportationModeII.DRIVING);
        System.out.println(directionService.getETA());
    }
}
