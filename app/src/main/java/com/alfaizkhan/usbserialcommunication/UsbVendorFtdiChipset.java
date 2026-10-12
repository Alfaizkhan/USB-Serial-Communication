package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * FTDI chipset identification table and driver flags.
 */
public final class UsbVendorFtdiChipset {
    private final String identifier;
    private final long timestamp;

    public UsbVendorFtdiChipset() {
        this("UsbVendorFtdiChipset");
    }

    public UsbVendorFtdiChipset(String identifier) {
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
        return "UsbVendorFtdiChipset[" + identifier + "]";
    }
}
