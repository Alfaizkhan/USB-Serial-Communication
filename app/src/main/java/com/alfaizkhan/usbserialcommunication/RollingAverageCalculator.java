package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Sliding window exponential rolling average calculator.
 */
public final class RollingAverageCalculator {
    private final String identifier;
    private final long timestamp;

    public RollingAverageCalculator() {
        this("RollingAverageCalculator");
    }

    public RollingAverageCalculator(String identifier) {
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
        return "RollingAverageCalculator[" + identifier + "]";
    }
}
