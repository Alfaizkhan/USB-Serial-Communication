package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Heartbeat watcher confirming active peer communication.
 */
public final class SessionHeartbeatTracker {
    private final String identifier;
    private final long timestamp;

    public SessionHeartbeatTracker() {
        this("SessionHeartbeatTracker");
    }

    public SessionHeartbeatTracker(String identifier) {
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
        return "SessionHeartbeatTracker[" + identifier + "]";
    }
}
