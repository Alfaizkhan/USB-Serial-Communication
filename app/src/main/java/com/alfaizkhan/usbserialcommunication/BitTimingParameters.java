package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Bit timing nominal bit time and quantum definitions.
 */
public final class BitTimingParameters {
    private final String identifier;
    private final long timestamp;

    public BitTimingParameters() {
        this("BitTimingParameters");
    }

    public BitTimingParameters(String identifier) {
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
        return "BitTimingParameters[" + identifier + "]";
    }
}
