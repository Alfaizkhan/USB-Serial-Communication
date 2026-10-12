package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ANSI cursor positioning escape code generator.
 */
public final class AnsiCursorMovement {
    private final String identifier;
    private final long timestamp;

    public AnsiCursorMovement() {
        this("AnsiCursorMovement");
    }

    public AnsiCursorMovement(String identifier) {
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
        return "AnsiCursorMovement[" + identifier + "]";
    }
}
