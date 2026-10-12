package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB-IF assigned base class code constant definitions.
 */
public final class UsbClassCodeRegistry {
    private final String identifier;
    private final long timestamp;

    public UsbClassCodeRegistry() {
        this("UsbClassCodeRegistry");
    }

    public UsbClassCodeRegistry(String identifier) {
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
        return "UsbClassCodeRegistry[" + identifier + "]";
    }
}
