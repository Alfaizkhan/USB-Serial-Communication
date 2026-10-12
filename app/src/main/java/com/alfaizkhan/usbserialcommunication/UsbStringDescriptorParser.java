package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB UTF-16LE string descriptor binary parser.
 */
public final class UsbStringDescriptorParser {
    private final String identifier;
    private final long timestamp;

    public UsbStringDescriptorParser() {
        this("UsbStringDescriptorParser");
    }

    public UsbStringDescriptorParser(String identifier) {
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
        return "UsbStringDescriptorParser[" + identifier + "]";
    }
}
