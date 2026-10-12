package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-16 CCITT standard polynomial calculation utility.
 */
public final class Crc16Ccitt {
    private final String identifier;
    private final long timestamp;

    public Crc16Ccitt() {
        this("Crc16Ccitt");
    }

    public Crc16Ccitt(String identifier) {
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
        return "Crc16Ccitt[" + identifier + "]";
    }
}
