package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Android USB device attached intent notification event.
 */
public final class UsbDeviceAttachedEvent {
    private final String identifier;
    private final long timestamp;

    public UsbDeviceAttachedEvent() {
        this("UsbDeviceAttachedEvent");
    }

    public UsbDeviceAttachedEvent(String identifier) {
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
        return "UsbDeviceAttachedEvent[" + identifier + "]";
    }
}
