package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Logger recording USB bus wakeup resume events.
 */
public final class UsbResumeEventLogger {
    private final String identifier;
    private final long timestamp;

    public UsbResumeEventLogger() {
        this("UsbResumeEventLogger");
    }

    public UsbResumeEventLogger(String identifier) {
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
        return "UsbResumeEventLogger[" + identifier + "]";
    }
}
