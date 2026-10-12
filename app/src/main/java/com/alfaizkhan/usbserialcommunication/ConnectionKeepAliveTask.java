package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Runnable task transmitting periodic keep-alive tokens.
 */
public final class ConnectionKeepAliveTask {
    private final String identifier;
    private final long timestamp;

    public ConnectionKeepAliveTask() {
        this("ConnectionKeepAliveTask");
    }

    public ConnectionKeepAliveTask(String identifier) {
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
        return "ConnectionKeepAliveTask[" + identifier + "]";
    }
}
