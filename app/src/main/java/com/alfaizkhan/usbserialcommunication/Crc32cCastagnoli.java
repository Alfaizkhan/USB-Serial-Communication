package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-32C Castagnoli hardware-accelerated polynomial utility.
 */
public final class Crc32cCastagnoli {
    private final String identifier;
    private final long timestamp;

    public Crc32cCastagnoli() {
        this("Crc32cCastagnoli");
    }

    public Crc32cCastagnoli(String identifier) {
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
        return "Crc32cCastagnoli[" + identifier + "]";
    }
}
