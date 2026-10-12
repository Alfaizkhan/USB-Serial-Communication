package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * High contrast black-and-white monochrome terminal theme.
 */
public final class MonochromeThemePalette {
    private final String identifier;
    private final long timestamp;

    public MonochromeThemePalette() {
        this("MonochromeThemePalette");
    }

    public MonochromeThemePalette(String identifier) {
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
        return "MonochromeThemePalette[" + identifier + "]";
    }
}
