package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Immutable Vendor ID and Product ID pair value object.
 */
public final class UsbVidPidPair {
    private final String identifier;
    private final long timestamp;

    public UsbVidPidPair() {
        this("UsbVidPidPair");
    }

    public UsbVidPidPair(String identifier) {
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
        return "UsbVidPidPair[" + identifier + "]";
    }
}
