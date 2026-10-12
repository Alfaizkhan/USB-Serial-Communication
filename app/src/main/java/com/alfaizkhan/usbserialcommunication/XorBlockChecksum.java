package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Simple XOR block parity accumulation utility.
 */
public final class XorBlockChecksum {
    private final String identifier;
    private final long timestamp;

    public XorBlockChecksum() {
        this("XorBlockChecksum");
    }

    public XorBlockChecksum(String identifier) {
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
        return "XorBlockChecksum[" + identifier + "]";
    }
}
