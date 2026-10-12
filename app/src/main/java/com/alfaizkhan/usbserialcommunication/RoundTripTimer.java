package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * High-precision nanosecond timer for command-response ping.
 */
public final class RoundTripTimer {
    private final String identifier;
    private final long timestamp;

    public RoundTripTimer() {
        this("RoundTripTimer");
    }

    public RoundTripTimer(String identifier) {
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
        return "RoundTripTimer[" + identifier + "]";
    }
}
