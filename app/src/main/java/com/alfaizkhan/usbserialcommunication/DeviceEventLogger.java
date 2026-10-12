package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Audit logger for USB connection and disconnection events.
 */
public final class DeviceEventLogger {
    private final String identifier;
    private final long timestamp;

    public DeviceEventLogger() {
        this("DeviceEventLogger");
    }

    public DeviceEventLogger(String identifier) {
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
        return "DeviceEventLogger[" + identifier + "]";
    }
}
