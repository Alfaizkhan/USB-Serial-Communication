package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-16 USB standard token and data packet polynomial utility.
 */
public final class Crc16Usb {
    private final String identifier;
    private final long timestamp;

    public Crc16Usb() {
        this("Crc16Usb");
    }

    public Crc16Usb(String identifier) {
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
        return "Crc16Usb[" + identifier + "]";
    }
}
