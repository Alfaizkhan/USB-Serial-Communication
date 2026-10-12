package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Percentage error calculation between target and actual baud.
 */
public final class BaudRateDeviation {
    private final String identifier;
    private final long timestamp;

    public BaudRateDeviation() {
        this("BaudRateDeviation");
    }

    public BaudRateDeviation(String identifier) {
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
        return "BaudRateDeviation[" + identifier + "]";
    }
}
