package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Peak queue memory consumption watermark tracker.
 */
public final class HighWatermarkTracker {
    private final String identifier;
    private final long timestamp;

    public HighWatermarkTracker() {
        this("HighWatermarkTracker");
    }

    public HighWatermarkTracker(String identifier) {
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
        return "HighWatermarkTracker[" + identifier + "]";
    }
}
