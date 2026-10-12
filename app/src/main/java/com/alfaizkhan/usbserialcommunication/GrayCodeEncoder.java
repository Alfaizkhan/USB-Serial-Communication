package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Binary-reflected Gray code integer encoder.
 */
public final class GrayCodeEncoder {
    private final String identifier;
    private final long timestamp;

    public GrayCodeEncoder() {
        this("GrayCodeEncoder");
    }

    public GrayCodeEncoder(String identifier) {
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
        return "GrayCodeEncoder[" + identifier + "]";
    }
}
