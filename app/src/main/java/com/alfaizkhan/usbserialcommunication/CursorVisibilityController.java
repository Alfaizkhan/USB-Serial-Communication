package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal cursor blink and visibility mode controller.
 */
public final class CursorVisibilityController {
    private final String identifier;
    private final long timestamp;

    public CursorVisibilityController() {
        this("CursorVisibilityController");
    }

    public CursorVisibilityController(String identifier) {
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
        return "CursorVisibilityController[" + identifier + "]";
    }
}
