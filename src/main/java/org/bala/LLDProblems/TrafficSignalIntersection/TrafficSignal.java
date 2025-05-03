package org.bala.LLDProblems.TrafficSignalIntersection;

import java.util.concurrent.atomic.AtomicBoolean;

public class TrafficSignal {
    private SignalType signal;
    private final AtomicBoolean isEmergencyApproaching;

    TrafficSignal(SignalType signal) {
        this.signal = signal;
        this.isEmergencyApproaching = new AtomicBoolean(false);
    }

    public synchronized boolean getIsEmergencyApproaching() {
        return this.isEmergencyApproaching.get();
    }

    public synchronized void setIsEmergencyApproaching(boolean value) {
        this.isEmergencyApproaching.set(value);
    }

    public synchronized void setSignal(SignalType signal) {
        this.signal = signal;
    }
}
