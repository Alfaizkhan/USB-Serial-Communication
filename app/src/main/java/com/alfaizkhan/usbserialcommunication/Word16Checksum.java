package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 16-bit word aligned parity accumulator.
 */
public final class Word16Checksum {
    private final String identifier;
    private final long timestamp;

    public Word16Checksum() {
        this("Word16Checksum");
    }

    public Word16Checksum(String identifier) {
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
        return "Word16Checksum[" + identifier + "]";
    }
}
