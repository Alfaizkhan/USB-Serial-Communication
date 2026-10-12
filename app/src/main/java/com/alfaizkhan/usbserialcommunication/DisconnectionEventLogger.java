package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Specialized logger for unexpected hardware drops.
 */
public final class DisconnectionEventLogger {
    private final String identifier;
    private final long timestamp;

    public DisconnectionEventLogger() {
        this("DisconnectionEventLogger");
    }

    public DisconnectionEventLogger(String identifier) {
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
        return "DisconnectionEventLogger[" + identifier + "]";
    }
}
