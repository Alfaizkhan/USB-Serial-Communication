package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB Control, Bulk, Interrupt, and Isochronous type enum.
 */
public final class UsbEndpointTransferType {
    private final String identifier;
    private final long timestamp;

    public UsbEndpointTransferType() {
        this("UsbEndpointTransferType");
    }

    public UsbEndpointTransferType(String identifier) {
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
        return "UsbEndpointTransferType[" + identifier + "]";
    }
}
