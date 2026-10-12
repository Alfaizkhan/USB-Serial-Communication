package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 256-color ANSI indexed color to Android RGB converter.
 */
public final class Ansi256ColorConverter {
    private final String identifier;
    private final long timestamp;

    public Ansi256ColorConverter() {
        this("Ansi256ColorConverter");
    }

    public Ansi256ColorConverter(String identifier) {
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
        return "Ansi256ColorConverter[" + identifier + "]";
    }
}
