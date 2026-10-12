package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Matching rule criteria for USB auto-connect filter lists.
 */
public final class UsbDeviceFilterRule {
    private final String identifier;
    private final long timestamp;

    public UsbDeviceFilterRule() {
        this("UsbDeviceFilterRule");
    }

    public UsbDeviceFilterRule(String identifier) {
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
        return "UsbDeviceFilterRule[" + identifier + "]";
    }
}
