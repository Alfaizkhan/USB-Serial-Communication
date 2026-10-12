package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Context object holding active device, socket, and configuration.
 */
public final class ThreadSafeSessionContext {
    private final String identifier;
    private final long timestamp;

    public ThreadSafeSessionContext() {
        this("ThreadSafeSessionContext");
    }

    public ThreadSafeSessionContext(String identifier) {
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
        return "ThreadSafeSessionContext[" + identifier + "]";
    }
}
