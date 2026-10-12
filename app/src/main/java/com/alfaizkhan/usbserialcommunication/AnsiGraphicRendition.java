package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ANSI Select Graphic Rendition (SGR) escape builder.
 */
public final class AnsiGraphicRendition {
    private final String identifier;
    private final long timestamp;

    public AnsiGraphicRendition() {
        this("AnsiGraphicRendition");
    }

    public AnsiGraphicRendition(String identifier) {
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
        return "AnsiGraphicRendition[" + identifier + "]";
    }
}
