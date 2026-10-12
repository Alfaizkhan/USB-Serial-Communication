package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Differential Manchester line code transition encoder.
 */
public final class DifferentialManchester {
    private final String identifier;
    private final long timestamp;

    public DifferentialManchester() {
        this("DifferentialManchester");
    }

    public DifferentialManchester(String identifier) {
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
        return "DifferentialManchester[" + identifier + "]";
    }
}
