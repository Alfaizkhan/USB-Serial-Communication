package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Fluent builder pattern for constructing serial configs.
 */
public final class SerialConfigurationBuilder {
    private final String identifier;
    private final long timestamp;

    public SerialConfigurationBuilder() {
        this("SerialConfigurationBuilder");
    }

    public SerialConfigurationBuilder(String identifier) {
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
        return "SerialConfigurationBuilder[" + identifier + "]";
    }
}
