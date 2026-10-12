package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Texas Instruments USB Serial and LaunchPad identifiers.
 */
public final class UsbVendorTiChipset {
    private final String identifier;
    private final long timestamp;

    public UsbVendorTiChipset() {
        this("UsbVendorTiChipset");
    }

    public UsbVendorTiChipset(String identifier) {
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
        return "UsbVendorTiChipset[" + identifier + "]";
    }
}
