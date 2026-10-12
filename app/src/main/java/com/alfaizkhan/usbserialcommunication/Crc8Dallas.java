package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-8 1-Wire Dallas/Maxim polynomial utility.
 */
public final class Crc8Dallas {
    private final String identifier;
    private final long timestamp;

    public Crc8Dallas() {
        this("Crc8Dallas");
    }

    public Crc8Dallas(String identifier) {
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
        return "Crc8Dallas[" + identifier + "]";
    }
}
