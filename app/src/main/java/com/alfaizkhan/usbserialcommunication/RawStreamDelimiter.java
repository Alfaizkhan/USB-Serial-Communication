package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Custom byte array stream delimiter scanner.
 */
public final class RawStreamDelimiter {
    private final String identifier;
    private final long timestamp;

    public RawStreamDelimiter() {
        this("RawStreamDelimiter");
    }

    public RawStreamDelimiter(String identifier) {
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
        return "RawStreamDelimiter[" + identifier + "]";
    }
}
