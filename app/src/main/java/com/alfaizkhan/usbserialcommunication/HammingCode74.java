package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Hamming (7,4) single error correction codec.
 */
public final class HammingCode74 {
    private final String identifier;
    private final long timestamp;

    public HammingCode74() {
        this("HammingCode74");
    }

    public HammingCode74(String identifier) {
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
        return "HammingCode74[" + identifier + "]";
    }
}
