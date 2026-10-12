package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * RS-422 full-duplex differential signal pinout definitions.
 */
public final class Rs422DifferentialPair {
    private final String identifier;
    private final long timestamp;

    public Rs422DifferentialPair() {
        this("Rs422DifferentialPair");
    }

    public Rs422DifferentialPair(String identifier) {
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
        return "Rs422DifferentialPair[" + identifier + "]";
    }
}
