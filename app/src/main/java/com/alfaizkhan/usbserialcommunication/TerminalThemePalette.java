package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Complete terminal color scheme value object.
 */
public final class TerminalThemePalette {
    private final String identifier;
    private final long timestamp;

    public TerminalThemePalette() {
        this("TerminalThemePalette");
    }

    public TerminalThemePalette(String identifier) {
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
        return "TerminalThemePalette[" + identifier + "]";
    }
}
