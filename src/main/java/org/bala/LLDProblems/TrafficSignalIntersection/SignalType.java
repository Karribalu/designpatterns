package org.bala.LLDProblems.TrafficSignalIntersection;

public enum SignalType {

    RED("Stop", 30),
    GREEN("Go", 25),
    YELLOW("Caution", 5);
    private final int duration;
    private final String message;

    SignalType(String message, int duration) {
        this.message = message;
        this.duration = duration;
    }

    public String getMessage() {
        return this.message;
    }

    public int getDuration() {
        return this.duration;
    }
}

