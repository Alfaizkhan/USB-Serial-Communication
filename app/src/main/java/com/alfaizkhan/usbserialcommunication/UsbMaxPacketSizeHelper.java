package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB full-speed and high-speed max packet size validator.
 */
public final class UsbMaxPacketSizeHelper {
    private final String identifier;
    private final long timestamp;

    public UsbMaxPacketSizeHelper() {
        this("UsbMaxPacketSizeHelper");
    }

    public UsbMaxPacketSizeHelper(String identifier) {
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
        return "UsbMaxPacketSizeHelper[" + identifier + "]";
    }
}
