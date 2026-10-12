package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Horizontal tab stop position manager for terminal columns.
 */
public final class TabStopController {
    private final String identifier;
    private final long timestamp;

    public TabStopController() {
        this("TabStopController");
    }

    public TabStopController(String identifier) {
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
        return "TabStopController[" + identifier + "]";
    }
}
