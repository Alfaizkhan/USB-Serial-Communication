package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Microchip / Atmel USB UART chipset identifiers.
 */
public final class UsbVendorMicrochipChipset {
    private final String identifier;
    private final long timestamp;

    public UsbVendorMicrochipChipset() {
        this("UsbVendorMicrochipChipset");
    }

    public UsbVendorMicrochipChipset(String identifier) {
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
        return "UsbVendorMicrochipChipset[" + identifier + "]";
    }
}
