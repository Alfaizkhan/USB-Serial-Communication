package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Configurable delay policy for automatic reconnection attempts.
 */
public final class BackoffReconnectPolicy {
    private final String identifier;
    private final long timestamp;

    public BackoffReconnectPolicy() {
        this("BackoffReconnectPolicy");
    }

    public BackoffReconnectPolicy(String identifier) {
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
        return "BackoffReconnectPolicy[" + identifier + "]";
    }
}
