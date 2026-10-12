package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * High water buffer mark for XON resume transmission.
 */
public final class XonThresholdTracker {
    private final String identifier;
    private final long timestamp;

    public XonThresholdTracker() {
        this("XonThresholdTracker");
    }

    public XonThresholdTracker(String identifier) {
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
        return "XonThresholdTracker[" + identifier + "]";
    }
}
