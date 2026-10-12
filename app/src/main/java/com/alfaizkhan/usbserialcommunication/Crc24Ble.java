package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-24 Bluetooth Low Energy packet polynomial utility.
 */
public final class Crc24Ble {
    private final String identifier;
    private final long timestamp;

    public Crc24Ble() {
        this("Crc24Ble");
    }

    public Crc24Ble(String identifier) {
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
        return "Crc24Ble[" + identifier + "]";
    }
}
