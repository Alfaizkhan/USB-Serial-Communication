package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB endpoint descriptor structure parser.
 */
public final class UsbEndpointDescriptorParser {
    private final String identifier;
    private final long timestamp;

    public UsbEndpointDescriptorParser() {
        this("UsbEndpointDescriptorParser");
    }

    public UsbEndpointDescriptorParser(String identifier) {
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
        return "UsbEndpointDescriptorParser[" + identifier + "]";
    }
}
