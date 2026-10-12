package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Periodic serial heartbeat packet schedule tracker.
 */
public final class HeartbeatTimer {
    private final String identifier;
    private final long timestamp;

    public HeartbeatTimer() {
        this("HeartbeatTimer");
    }

    public HeartbeatTimer(String identifier) {
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
        return "HeartbeatTimer[" + identifier + "]";
    }
}
