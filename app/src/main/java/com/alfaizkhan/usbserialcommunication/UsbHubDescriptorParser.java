package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB hub descriptor topology and port count parser.
 */
public final class UsbHubDescriptorParser {
    private final String identifier;
    private final long timestamp;

    public UsbHubDescriptorParser() {
        this("UsbHubDescriptorParser");
    }

    public UsbHubDescriptorParser(String identifier) {
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
        return "UsbHubDescriptorParser[" + identifier + "]";
    }
}
