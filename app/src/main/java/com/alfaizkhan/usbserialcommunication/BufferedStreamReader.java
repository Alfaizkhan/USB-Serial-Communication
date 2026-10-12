package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Buffered character stream reader for serial text.
 */
public final class BufferedStreamReader {
    private final String identifier;
    private final long timestamp;

    public BufferedStreamReader() {
        this("BufferedStreamReader");
    }

    public BufferedStreamReader(String identifier) {
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
        return "BufferedStreamReader[" + identifier + "]";
    }
}
