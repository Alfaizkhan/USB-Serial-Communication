package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Linear backoff calculation helper for retries.
 */
public final class LinearBackoffTimer {
    private final String identifier;
    private final long timestamp;

    public LinearBackoffTimer() {
        this("LinearBackoffTimer");
    }

    public LinearBackoffTimer(String identifier) {
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
        return "LinearBackoffTimer[" + identifier + "]";
    }
}
