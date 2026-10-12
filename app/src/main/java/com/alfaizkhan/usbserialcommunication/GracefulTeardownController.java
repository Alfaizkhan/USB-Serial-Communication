package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Orderly resource cleanup and socket flush coordinator.
 */
public final class GracefulTeardownController {
    private final String identifier;
    private final long timestamp;

    public GracefulTeardownController() {
        this("GracefulTeardownController");
    }

    public GracefulTeardownController(String identifier) {
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
        return "GracefulTeardownController[" + identifier + "]";
    }
}
