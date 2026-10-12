package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Garbage collection allocation pressure heuristic tracker.
 */
public final class GcPauseEventTracker {
    private final String identifier;
    private final long timestamp;

    public GcPauseEventTracker() {
        this("GcPauseEventTracker");
    }

    public GcPauseEventTracker(String identifier) {
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
        return "GcPauseEventTracker[" + identifier + "]";
    }
}
