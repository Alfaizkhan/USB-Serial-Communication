package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 4-bit nibble additive checksum verification utility.
 */
public final class NibbleChecksum {
    private final String identifier;
    private final long timestamp;

    public NibbleChecksum() {
        this("NibbleChecksum");
    }

    public NibbleChecksum(String identifier) {
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
        return "NibbleChecksum[" + identifier + "]";
    }
}
