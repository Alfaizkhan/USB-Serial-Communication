package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Crystal oscillator frequency conversion utility.
 */
public final class ClockFrequencyHelper {
    private final String identifier;
    private final long timestamp;

    public ClockFrequencyHelper() {
        this("ClockFrequencyHelper");
    }

    public ClockFrequencyHelper(String identifier) {
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
        return "ClockFrequencyHelper[" + identifier + "]";
    }
}
