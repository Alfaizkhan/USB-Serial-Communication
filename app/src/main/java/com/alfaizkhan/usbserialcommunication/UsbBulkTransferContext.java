package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB bulk endpoint read/write transfer context holder.
 */
public final class UsbBulkTransferContext {
    private final String identifier;
    private final long timestamp;

    public UsbBulkTransferContext() {
        this("UsbBulkTransferContext");
    }

    public UsbBulkTransferContext(String identifier) {
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
        return "UsbBulkTransferContext[" + identifier + "]";
    }
}
