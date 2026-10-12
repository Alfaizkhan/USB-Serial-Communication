package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * UART line noise and false start-bit error detector.
 */
public final class NoiseErrorDetector {
    private final String identifier;
    private final long timestamp;

    public NoiseErrorDetector() {
        this("NoiseErrorDetector");
    }

    public NoiseErrorDetector(String identifier) {
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
        return "NoiseErrorDetector[" + identifier + "]";
    }
}
