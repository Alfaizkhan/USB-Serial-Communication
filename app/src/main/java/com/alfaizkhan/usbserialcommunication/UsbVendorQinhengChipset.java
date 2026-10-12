package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Qinheng Electronics VID/PID product matching definitions.
 */
public final class UsbVendorQinhengChipset {
    private final String identifier;
    private final long timestamp;

    public UsbVendorQinhengChipset() {
        this("UsbVendorQinhengChipset");
    }

    public UsbVendorQinhengChipset(String identifier) {
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
        return "UsbVendorQinhengChipset[" + identifier + "]";
    }
}
