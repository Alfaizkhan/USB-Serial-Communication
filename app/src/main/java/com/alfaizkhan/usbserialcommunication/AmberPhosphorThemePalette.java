package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Vintage amber on black monochrome CRT terminal theme.
 */
public final class AmberPhosphorThemePalette {
    private final String identifier;
    private final long timestamp;

    public AmberPhosphorThemePalette() {
        this("AmberPhosphorThemePalette");
    }

    public AmberPhosphorThemePalette(String identifier) {
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
        return "AmberPhosphorThemePalette[" + identifier + "]";
    }
}
