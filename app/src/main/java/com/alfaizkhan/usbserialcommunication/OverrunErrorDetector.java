package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * UART hardware receiver buffer overrun error detector.
 */
public final class OverrunErrorDetector {
    private final String identifier;
    private final long timestamp;

    public OverrunErrorDetector() {
        this("OverrunErrorDetector");
    }

    public OverrunErrorDetector(String identifier) {
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
        return "OverrunErrorDetector[" + identifier + "]";
    }
}
