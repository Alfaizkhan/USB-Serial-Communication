package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB product identifier formatting and lookup helper.
 */
public final class UsbProductIdentifier {
    private final String identifier;
    private final long timestamp;

    public UsbProductIdentifier() {
        this("UsbProductIdentifier");
    }

    public UsbProductIdentifier(String identifier) {
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
        return "UsbProductIdentifier[" + identifier + "]";
    }
}
