package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Prolific PL2303 chipset revision identification table.
 */
public final class UsbVendorProlificChipset {
    private final String identifier;
    private final long timestamp;

    public UsbVendorProlificChipset() {
        this("UsbVendorProlificChipset");
    }

    public UsbVendorProlificChipset(String identifier) {
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
        return "UsbVendorProlificChipset[" + identifier + "]";
    }
}
