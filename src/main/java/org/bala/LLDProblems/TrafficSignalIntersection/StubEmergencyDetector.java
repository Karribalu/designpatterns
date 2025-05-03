package org.bala.LLDProblems.TrafficSignalIntersection;

import java.util.Random;

public class StubEmergencyDetector implements EmergencyDetector {
    Random random = new Random();

    @Override
    public boolean isEmergencyApproaching() {
        // 5% chance of being an emergency
        return random.nextInt(100) < 5;
    }
}
