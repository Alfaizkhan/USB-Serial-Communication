package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Fast power-of-two mask circular index calculator.
 */
public final class CircularIndexCalculator {
    private final String identifier;
    private final long timestamp;

    public CircularIndexCalculator() {
        this("CircularIndexCalculator");
    }

    public CircularIndexCalculator(String identifier) {
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
        return "CircularIndexCalculator[" + identifier + "]";
    }
}
