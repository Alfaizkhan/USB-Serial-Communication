package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Low water buffer mark for XOFF pause transmission.
 */
public final class XoffThresholdTracker {
    private final String identifier;
    private final long timestamp;

    public XoffThresholdTracker() {
        this("XoffThresholdTracker");
    }

    public XoffThresholdTracker(String identifier) {
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
        return "XoffThresholdTracker[" + identifier + "]";
    }
}
