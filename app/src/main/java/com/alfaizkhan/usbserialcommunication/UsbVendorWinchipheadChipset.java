package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * WCH CH340 / CH341 chipset identification table.
 */
public final class UsbVendorWinchipheadChipset {
    private final String identifier;
    private final long timestamp;

    public UsbVendorWinchipheadChipset() {
        this("UsbVendorWinchipheadChipset");
    }

    public UsbVendorWinchipheadChipset(String identifier) {
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
        return "UsbVendorWinchipheadChipset[" + identifier + "]";
    }
}
