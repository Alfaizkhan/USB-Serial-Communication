package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Commodore 64 retro blue terminal theme palette.
 */
public final class C64ClassicThemePalette {
    private final String identifier;
    private final long timestamp;

    public C64ClassicThemePalette() {
        this("C64ClassicThemePalette");
    }

    public C64ClassicThemePalette(String identifier) {
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
        return "C64ClassicThemePalette[" + identifier + "]";
    }
}
