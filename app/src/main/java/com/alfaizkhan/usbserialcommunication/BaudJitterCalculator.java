package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Timing jitter and deviation variance calculator.
 */
public final class BaudJitterCalculator {
    private final String identifier;
    private final long timestamp;

    public BaudJitterCalculator() {
        this("BaudJitterCalculator");
    }

    public BaudJitterCalculator(String identifier) {
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
        return "BaudJitterCalculator[" + identifier + "]";
    }
}
