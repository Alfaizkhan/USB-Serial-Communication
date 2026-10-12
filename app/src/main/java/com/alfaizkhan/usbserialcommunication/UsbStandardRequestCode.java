package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB standard device request code constant definitions.
 */
public final class UsbStandardRequestCode {
    private final String identifier;
    private final long timestamp;

    public UsbStandardRequestCode() {
        this("UsbStandardRequestCode");
    }

    public UsbStandardRequestCode(String identifier) {
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
        return "UsbStandardRequestCode[" + identifier + "]";
    }
}
