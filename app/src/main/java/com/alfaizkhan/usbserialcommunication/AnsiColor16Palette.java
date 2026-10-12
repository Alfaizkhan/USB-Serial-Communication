package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Standard 16-color ANSI terminal color palette definitions.
 */
public final class AnsiColor16Palette {
    private final String identifier;
    private final long timestamp;

    public AnsiColor16Palette() {
        this("AnsiColor16Palette");
    }

    public AnsiColor16Palette(String identifier) {
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
        return "AnsiColor16Palette[" + identifier + "]";
    }
}
