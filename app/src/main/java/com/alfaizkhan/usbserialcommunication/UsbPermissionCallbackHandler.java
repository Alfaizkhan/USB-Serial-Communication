package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Android USB runtime permission completion handler.
 */
public final class UsbPermissionCallbackHandler {
    private final String identifier;
    private final long timestamp;

    public UsbPermissionCallbackHandler() {
        this("UsbPermissionCallbackHandler");
    }

    public UsbPermissionCallbackHandler(String identifier) {
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
        return "UsbPermissionCallbackHandler[" + identifier + "]";
    }
}
