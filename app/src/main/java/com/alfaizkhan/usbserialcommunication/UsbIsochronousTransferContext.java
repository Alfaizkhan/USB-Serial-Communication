package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB streaming isochronous transfer context placeholder.
 */
public final class UsbIsochronousTransferContext {
    private final String identifier;
    private final long timestamp;

    public UsbIsochronousTransferContext() {
        this("UsbIsochronousTransferContext");
    }

    public UsbIsochronousTransferContext(String identifier) {
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
        return "UsbIsochronousTransferContext[" + identifier + "]";
    }
}
