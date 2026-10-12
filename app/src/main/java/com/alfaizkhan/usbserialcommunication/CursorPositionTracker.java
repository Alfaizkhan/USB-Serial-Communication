package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal virtual cursor row and column position tracker.
 */
public final class CursorPositionTracker {
    private final String identifier;
    private final long timestamp;

    public CursorPositionTracker() {
        this("CursorPositionTracker");
    }

    public CursorPositionTracker(String identifier) {
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
        return "CursorPositionTracker[" + identifier + "]";
    }
}
