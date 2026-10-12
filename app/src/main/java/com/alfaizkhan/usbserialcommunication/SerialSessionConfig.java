package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Immutable configuration object for baud rate, framing, and timeouts.
 */
public final class SerialSessionConfig {
    private final String identifier;
    private final long timestamp;

    public SerialSessionConfig() {
        this("SerialSessionConfig");
    }

    public SerialSessionConfig(String identifier) {
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
        return "SerialSessionConfig[" + identifier + "]";
    }
}
