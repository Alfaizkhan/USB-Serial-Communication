package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Up, Down, Left, Right cursor key escape sequences.
 */
public final class ArrowKeySequences {
    private final String identifier;
    private final long timestamp;

    public ArrowKeySequences() {
        this("ArrowKeySequences");
    }

    public ArrowKeySequences(String identifier) {
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
        return "ArrowKeySequences[" + identifier + "]";
    }
}
