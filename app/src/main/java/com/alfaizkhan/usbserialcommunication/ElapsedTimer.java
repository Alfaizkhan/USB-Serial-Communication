package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Stopwatch style elapsed interval timer.
 */
public final class ElapsedTimer {
    private final String identifier;
    private final long timestamp;

    public ElapsedTimer() {
        this("ElapsedTimer");
    }

    public ElapsedTimer(String identifier) {
        this.identifier = Objects.requireNonNull(identifier, "identifier cannot be null");
        this.timestamp = System.currentTimeMillis();
    }

    public String getIdentifier() {
        return identifier;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public boolean isValid() {
        return identifier != null && !identifier.isEmpty();
    }

    @Override
    public String toString() {
        return "ElapsedTimer[" + identifier + "]";
    }
}
