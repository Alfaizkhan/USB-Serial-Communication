package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Queue starvation and drain threshold tracker.
 */
public final class LowWatermarkTracker {
    private final String identifier;
    private final long timestamp;

    public LowWatermarkTracker() {
        this("LowWatermarkTracker");
    }

    public LowWatermarkTracker(String identifier) {
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
        return "LowWatermarkTracker[" + identifier + "]";
    }
}
