package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Continuous low-state line break condition detector.
 */
public final class BreakConditionDetector {
    private final String identifier;
    private final long timestamp;

    public BreakConditionDetector() {
        this("BreakConditionDetector");
    }

    public BreakConditionDetector(String identifier) {
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
        return "BreakConditionDetector[" + identifier + "]";
    }
}
