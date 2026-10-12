package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Row of character cells representing one terminal line.
 */
public final class ScreenBufferRow {
    private final String identifier;
    private final long timestamp;

    public ScreenBufferRow() {
        this("ScreenBufferRow");
    }

    public ScreenBufferRow(String identifier) {
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
        return "ScreenBufferRow[" + identifier + "]";
    }
}
