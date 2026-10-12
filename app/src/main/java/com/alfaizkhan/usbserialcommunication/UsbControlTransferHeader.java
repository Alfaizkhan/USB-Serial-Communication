package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB 8-byte setup packet control transfer header.
 */
public final class UsbControlTransferHeader {
    private final String identifier;
    private final long timestamp;

    public UsbControlTransferHeader() {
        this("UsbControlTransferHeader");
    }

    public UsbControlTransferHeader(String identifier) {
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
        return "UsbControlTransferHeader[" + identifier + "]";
    }
}
