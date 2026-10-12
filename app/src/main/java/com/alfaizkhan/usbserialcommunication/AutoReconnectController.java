package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Automatic retry and reconnection controller upon detach.
 */
public final class AutoReconnectController {
    private final String identifier;
    private final long timestamp;

    public AutoReconnectController() {
        this("AutoReconnectController");
    }

    public AutoReconnectController(String identifier) {
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
        return "AutoReconnectController[" + identifier + "]";
    }
}
