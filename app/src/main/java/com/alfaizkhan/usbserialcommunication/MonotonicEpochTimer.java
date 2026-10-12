package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Monotonic time elapsed measurement helper.
 */
public final class MonotonicEpochTimer {
    private final String identifier;
    private final long timestamp;

    public MonotonicEpochTimer() {
        this("MonotonicEpochTimer");
    }

    public MonotonicEpochTimer(String identifier) {
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
        return "MonotonicEpochTimer[" + identifier + "]";
    }
}
