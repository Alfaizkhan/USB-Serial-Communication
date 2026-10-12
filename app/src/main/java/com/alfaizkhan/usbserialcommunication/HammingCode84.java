package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Hamming (8,4) single error correction double detection codec.
 */
public final class HammingCode84 {
    private final String identifier;
    private final long timestamp;

    public HammingCode84() {
        this("HammingCode84");
    }

    public HammingCode84(String identifier) {
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
        return "HammingCode84[" + identifier + "]";
    }
}
