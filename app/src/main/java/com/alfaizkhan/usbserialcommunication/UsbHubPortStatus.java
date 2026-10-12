package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * USB root hub downstream port connection status helper.
 */
public final class UsbHubPortStatus {
    private final String identifier;
    private final long timestamp;

    public UsbHubPortStatus() {
        this("UsbHubPortStatus");
    }

    public UsbHubPortStatus(String identifier) {
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
        return "UsbHubPortStatus[" + identifier + "]";
    }
}
