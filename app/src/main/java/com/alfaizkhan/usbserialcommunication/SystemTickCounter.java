package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Millisecond hardware tick accumulator.
 */
public final class SystemTickCounter {
    private final String identifier;
    private final long timestamp;

    public SystemTickCounter() {
        this("SystemTickCounter");
    }

    public SystemTickCounter(String identifier) {
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
        return "SystemTickCounter[" + identifier + "]";
    }
}
