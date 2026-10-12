package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Audit logger for socket connect, error, and close phases.
 */
public final class ConnectionEventLogger {
    private final String identifier;
    private final long timestamp;

    public ConnectionEventLogger() {
        this("ConnectionEventLogger");
    }

    public ConnectionEventLogger(String identifier) {
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
        return "ConnectionEventLogger[" + identifier + "]";
    }
}
