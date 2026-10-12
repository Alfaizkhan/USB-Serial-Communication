package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Top and bottom scrolling margin boundary definitions.
 */
public final class ScrollMarginDefinition {
    private final String identifier;
    private final long timestamp;

    public ScrollMarginDefinition() {
        this("ScrollMarginDefinition");
    }

    public ScrollMarginDefinition(String identifier) {
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
        return "ScrollMarginDefinition[" + identifier + "]";
    }
}
