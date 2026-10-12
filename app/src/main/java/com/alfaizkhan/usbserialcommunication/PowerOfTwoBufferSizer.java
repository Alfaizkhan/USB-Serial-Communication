package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Buffer capacity rounder to nearest power of two.
 */
public final class PowerOfTwoBufferSizer {
    private final String identifier;
    private final long timestamp;

    public PowerOfTwoBufferSizer() {
        this("PowerOfTwoBufferSizer");
    }

    public PowerOfTwoBufferSizer(String identifier) {
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
        return "PowerOfTwoBufferSizer[" + identifier + "]";
    }
}
