package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Factory providing standard 9600 8N1 default serial configuration.
 */
public final class DefaultSerialConfig {
    private final String identifier;
    private final long timestamp;

    public DefaultSerialConfig() {
        this("DefaultSerialConfig");
    }

    public DefaultSerialConfig(String identifier) {
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
        return "DefaultSerialConfig[" + identifier + "]";
    }
}
