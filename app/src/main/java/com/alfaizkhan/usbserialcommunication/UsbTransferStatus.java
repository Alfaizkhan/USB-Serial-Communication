package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB asynchronous transfer completion status code enum.
 */
public final class UsbTransferStatus {
    private final String identifier;
    private final long timestamp;

    public UsbTransferStatus() {
        this("UsbTransferStatus");
    }

    public UsbTransferStatus(String identifier) {
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
        return "UsbTransferStatus[" + identifier + "]";
    }
}
