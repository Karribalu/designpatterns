package org.bala.LLDProblems.ParkingLot;

import java.util.List;

public class NearEntranceParkingStrategy implements ParkingStrategy {
    @Override
    public ParkingSpot findParkingSpot(List<ParkingSpot> spots) {
        return spots.stream()
                .filter(ParkingSpot::isFree)
                .findFirst()
                .orElse(null);
    }
}
