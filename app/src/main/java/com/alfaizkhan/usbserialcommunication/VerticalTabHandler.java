package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ASCII 0x0B Vertical Tabulation line spacing handler.
 */
public final class VerticalTabHandler {
    private final String identifier;
    private final long timestamp;

    public VerticalTabHandler() {
        this("VerticalTabHandler");
    }

    public VerticalTabHandler(String identifier) {
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
        return "VerticalTabHandler[" + identifier + "]";
    }
}
