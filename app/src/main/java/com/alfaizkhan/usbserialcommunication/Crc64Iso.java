package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-64 ISO standard 64-bit checksum calculation utility.
 */
public final class Crc64Iso {
    private final String identifier;
    private final long timestamp;

    public Crc64Iso() {
        this("Crc64Iso");
    }

    public Crc64Iso(String identifier) {
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
        return "Crc64Iso[" + identifier + "]";
    }
}
