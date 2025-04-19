package org.bala.LLDProblems.ParkingLot;

import java.util.List;

public abstract class ParkingManager {
    public List<ParkingSpot> parkingSpots;

    public abstract ParkingSpot findParkingSpot(Vehicle vehicle);

    public abstract Ticket parkVehicle(Vehicle vehicle, ParkingSpot spot);
}
