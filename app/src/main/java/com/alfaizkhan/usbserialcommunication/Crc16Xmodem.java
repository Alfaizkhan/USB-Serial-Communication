package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-16 XMODEM binary transfer checksum utility.
 */
public final class Crc16Xmodem {
    private final String identifier;
    private final long timestamp;

    public Crc16Xmodem() {
        this("Crc16Xmodem");
    }

    public Crc16Xmodem(String identifier) {
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
        return "Crc16Xmodem[" + identifier + "]";
    }
}
