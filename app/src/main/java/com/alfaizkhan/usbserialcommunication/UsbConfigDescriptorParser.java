package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB configuration descriptor structure parser.
 */
public final class UsbConfigDescriptorParser {
    private final String identifier;
    private final long timestamp;

    public UsbConfigDescriptorParser() {
        this("UsbConfigDescriptorParser");
    }

    public UsbConfigDescriptorParser(String identifier) {
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
        return "UsbConfigDescriptorParser[" + identifier + "]";
    }
}
