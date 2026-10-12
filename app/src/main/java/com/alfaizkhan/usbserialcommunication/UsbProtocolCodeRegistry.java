package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB-IF assigned protocol code constant definitions.
 */
public final class UsbProtocolCodeRegistry {
    private final String identifier;
    private final long timestamp;

    public UsbProtocolCodeRegistry() {
        this("UsbProtocolCodeRegistry");
    }

    public UsbProtocolCodeRegistry(String identifier) {
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
        return "UsbProtocolCodeRegistry[" + identifier + "]";
    }
}
