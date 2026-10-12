package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB CDC ACM 7-byte line coding structure value object.
 */
public final class UsbCdcLineCoding {
    private final String identifier;
    private final long timestamp;

    public UsbCdcLineCoding() {
        this("UsbCdcLineCoding");
    }

    public UsbCdcLineCoding(String identifier) {
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
        return "UsbCdcLineCoding[" + identifier + "]";
    }
}
