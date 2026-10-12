package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Silicon Labs CP210x chipset identification table.
 */
public final class UsbVendorSiliconLabsChipset {
    private final String identifier;
    private final long timestamp;

    public UsbVendorSiliconLabsChipset() {
        this("UsbVendorSiliconLabsChipset");
    }

    public UsbVendorSiliconLabsChipset(String identifier) {
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
        return "UsbVendorSiliconLabsChipset[" + identifier + "]";
    }
}
