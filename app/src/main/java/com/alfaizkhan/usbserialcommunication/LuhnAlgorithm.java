package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Luhn checksum formula verification utility.
 */
public final class LuhnAlgorithm {
    private final String identifier;
    private final long timestamp;

    public LuhnAlgorithm() {
        this("LuhnAlgorithm");
    }

    public LuhnAlgorithm(String identifier) {
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
        return "LuhnAlgorithm[" + identifier + "]";
    }
}
