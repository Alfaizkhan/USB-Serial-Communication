package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Single character cell value object holding glyph and color.
 */
public final class ScreenBufferCell {
    private final String identifier;
    private final long timestamp;

    public ScreenBufferCell() {
        this("ScreenBufferCell");
    }

    public ScreenBufferCell(String identifier) {
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
        return "ScreenBufferCell[" + identifier + "]";
    }
}
