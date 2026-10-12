package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB-IF assigned subclass code constant definitions.
 */
public final class UsbSubclassCodeRegistry {
    private final String identifier;
    private final long timestamp;

    public UsbSubclassCodeRegistry() {
        this("UsbSubclassCodeRegistry");
    }

    public UsbSubclassCodeRegistry(String identifier) {
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
        return "UsbSubclassCodeRegistry[" + identifier + "]";
    }
}
