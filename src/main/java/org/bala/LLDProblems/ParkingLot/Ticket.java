package org.bala.LLDProblems.ParkingLot;

import java.time.LocalDateTime;

public class Ticket {
    public String id;
    public Vehicle vehicle;
    public LocalDateTime parkingTime;
    public ParkingSpot parkingSpot;

    public Ticket(String id, Vehicle vehicle, LocalDateTime parkingTime, ParkingSpot parkingSpot) {
        this.id = id;
        this.vehicle = vehicle;
        this.parkingTime = parkingTime;
        this.parkingSpot = parkingSpot;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id='" + id + '\'' +
                ", vehicle=" + vehicle +
                ", parkingTime=" + parkingTime +
                ", parkingSpot=" + parkingSpot +
                '}';
    }
}
