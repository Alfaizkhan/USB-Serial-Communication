package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Minimum and maximum observed metric value tracker.
 */
public final class MinMaxTracker {
    private final String identifier;
    private final long timestamp;

    public MinMaxTracker() {
        this("MinMaxTracker");
    }

    public MinMaxTracker(String identifier) {
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
        return "MinMaxTracker[" + identifier + "]";
    }
}
