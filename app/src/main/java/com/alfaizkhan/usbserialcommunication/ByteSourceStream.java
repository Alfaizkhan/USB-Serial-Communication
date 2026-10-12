package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Input source stream reading from byte queue buffers.
 */
public final class ByteSourceStream {
    private final String identifier;
    private final long timestamp;

    public ByteSourceStream() {
        this("ByteSourceStream");
    }

    public ByteSourceStream(String identifier) {
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
        return "ByteSourceStream[" + identifier + "]";
    }
}
