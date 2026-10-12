package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * STMicroelectronics Virtual COM Port identifiers.
 */
public final class UsbVendorStMicroelectronicsChipset {
    private final String identifier;
    private final long timestamp;

    public UsbVendorStMicroelectronicsChipset() {
        this("UsbVendorStMicroelectronicsChipset");
    }

    public UsbVendorStMicroelectronicsChipset(String identifier) {
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
        return "UsbVendorStMicroelectronicsChipset[" + identifier + "]";
    }
}
