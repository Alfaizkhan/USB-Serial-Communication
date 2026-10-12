package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ASCII 0x0A Line Feed next row advance handler.
 */
public final class LineFeedHandler {
    private final String identifier;
    private final long timestamp;

    public LineFeedHandler() {
        this("LineFeedHandler");
    }

    public LineFeedHandler(String identifier) {
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
        return "LineFeedHandler[" + identifier + "]";
    }
}
