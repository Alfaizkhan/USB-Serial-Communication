package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Two-complement additive checksum calculation utility.
 */
public final class TwoComplementSum {
    private final String identifier;
    private final long timestamp;

    public TwoComplementSum() {
        this("TwoComplementSum");
    }

    public TwoComplementSum(String identifier) {
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
        return "TwoComplementSum[" + identifier + "]";
    }
}
