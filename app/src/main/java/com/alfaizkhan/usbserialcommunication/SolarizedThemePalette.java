package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Solarized Dark and Light color palette definitions.
 */
public final class SolarizedThemePalette {
    private final String identifier;
    private final long timestamp;

    public SolarizedThemePalette() {
        this("SolarizedThemePalette");
    }

    public SolarizedThemePalette(String identifier) {
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
        return "SolarizedThemePalette[" + identifier + "]";
    }
}
