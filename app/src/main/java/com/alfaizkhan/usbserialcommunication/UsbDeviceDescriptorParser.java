package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Standard USB device descriptor binary parser.
 */
public final class UsbDeviceDescriptorParser {
    private final String identifier;
    private final long timestamp;

    public UsbDeviceDescriptorParser() {
        this("UsbDeviceDescriptorParser");
    }

    public UsbDeviceDescriptorParser(String identifier) {
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
        return "UsbDeviceDescriptorParser[" + identifier + "]";
    }
}
