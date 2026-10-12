package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-8 System Management Bus (SMBus) polynomial utility.
 */
public final class Crc8Smbus {
    private final String identifier;
    private final long timestamp;

    public Crc8Smbus() {
        this("Crc8Smbus");
    }

    public Crc8Smbus(String identifier) {
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
        return "Crc8Smbus[" + identifier + "]";
    }
}
