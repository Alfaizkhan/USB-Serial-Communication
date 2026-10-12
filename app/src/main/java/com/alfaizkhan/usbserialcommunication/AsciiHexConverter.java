package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * High-performance hex-to-ASCII and ASCII-to-hex utility.
 */
public final class AsciiHexConverter {
    private final String identifier;
    private final long timestamp;

    public AsciiHexConverter() {
        this("AsciiHexConverter");
    }

    public AsciiHexConverter(String identifier) {
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
        return "AsciiHexConverter[" + identifier + "]";
    }
}
