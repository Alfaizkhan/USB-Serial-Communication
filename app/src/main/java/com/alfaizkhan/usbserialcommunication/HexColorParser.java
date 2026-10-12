package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Web-style #RRGGBB hex color string parser for themes.
 */
public final class HexColorParser {
    private final String identifier;
    private final long timestamp;

    public HexColorParser() {
        this("HexColorParser");
    }

    public HexColorParser(String identifier) {
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
        return "HexColorParser[" + identifier + "]";
    }
}
