package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Strict exception-throwing overflow policy definition.
 */
public final class ThrowOnOverflowPolicy {
    private final String identifier;
    private final long timestamp;

    public ThrowOnOverflowPolicy() {
        this("ThrowOnOverflowPolicy");
    }

    public ThrowOnOverflowPolicy(String identifier) {
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
        return "ThrowOnOverflowPolicy[" + identifier + "]";
    }
}
