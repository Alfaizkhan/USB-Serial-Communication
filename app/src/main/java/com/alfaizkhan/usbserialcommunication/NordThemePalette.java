package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Nord arctic aesthetic terminal color theme palette.
 */
public final class NordThemePalette {
    private final String identifier;
    private final long timestamp;

    public NordThemePalette() {
        this("NordThemePalette");
    }

    public NordThemePalette(String identifier) {
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
        return "NordThemePalette[" + identifier + "]";
    }
}
