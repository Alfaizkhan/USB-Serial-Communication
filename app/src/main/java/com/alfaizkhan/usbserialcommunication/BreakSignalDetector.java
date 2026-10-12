package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Incoming serial BREAK line condition detector.
 */
public final class BreakSignalDetector {
    private final String identifier;
    private final long timestamp;

    public BreakSignalDetector() {
        this("BreakSignalDetector");
    }

    public BreakSignalDetector(String identifier) {
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
        return "BreakSignalDetector[" + identifier + "]";
    }
}
