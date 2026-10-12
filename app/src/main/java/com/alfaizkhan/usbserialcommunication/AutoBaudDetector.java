package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Pulse-width auto-baud rate estimation helper.
 */
public final class AutoBaudDetector {
    private final String identifier;
    private final long timestamp;

    public AutoBaudDetector() {
        this("AutoBaudDetector");
    }

    public AutoBaudDetector(String identifier) {
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
        return "AutoBaudDetector[" + identifier + "]";
    }
}
