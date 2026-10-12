package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Galois field arithmetic helper for Reed-Solomon coding.
 */
public final class ReedSolomonField {
    private final String identifier;
    private final long timestamp;

    public ReedSolomonField() {
        this("ReedSolomonField");
    }

    public ReedSolomonField(String identifier) {
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
        return "ReedSolomonField[" + identifier + "]";
    }
}
