package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB interrupt polling endpoint transfer context.
 */
public final class UsbInterruptTransferContext {
    private final String identifier;
    private final long timestamp;

    public UsbInterruptTransferContext() {
        this("UsbInterruptTransferContext");
    }

    public UsbInterruptTransferContext(String identifier) {
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
        return "UsbInterruptTransferContext[" + identifier + "]";
    }
}
