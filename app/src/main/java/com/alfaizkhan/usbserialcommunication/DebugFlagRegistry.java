package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Runtime toggleable debug logging flags registry.
 */
public final class DebugFlagRegistry {
    private final String identifier;
    private final long timestamp;

    public DebugFlagRegistry() {
        this("DebugFlagRegistry");
    }

    public DebugFlagRegistry(String identifier) {
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
        return "DebugFlagRegistry[" + identifier + "]";
    }
}
