package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Buffered character stream writer with auto-flushing.
 */
public final class BufferedStreamWriter {
    private final String identifier;
    private final long timestamp;

    public BufferedStreamWriter() {
        this("BufferedStreamWriter");
    }

    public BufferedStreamWriter(String identifier) {
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
        return "BufferedStreamWriter[" + identifier + "]";
    }
}
