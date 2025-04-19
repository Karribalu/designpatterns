package org.bala.LLDProblems.ParkingLot;

import java.util.List;

public class TwoWheelerParkingManager extends ParkingManager {
    TwoWheelerParkingManager(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }

    @Override
    public ParkingSpot findParkingSpot(Vehicle vehicle) {
        if(vehicle.vehicleType != VehicleType.TwoWheeler){
            throw new UnsupportedOperationException("Two Wheeler vehicles are only supported");
        }
        return null;
    }

    @Override
    public Ticket parkVehicle(Vehicle vehicle, ParkingSpot spot) {
        return null;
    }
}
