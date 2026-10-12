package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Consistent Overhead Byte Stuffing with Zero Pair Elimination.
 */
public final class CobsZpeCodec {
    private final String identifier;
    private final long timestamp;

    public CobsZpeCodec() {
        this("CobsZpeCodec");
    }

    public CobsZpeCodec(String identifier) {
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
        return "CobsZpeCodec[" + identifier + "]";
    }
}
