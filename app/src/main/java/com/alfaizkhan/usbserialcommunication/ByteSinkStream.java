package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Output sink stream writing to byte queue buffers.
 */
public final class ByteSinkStream {
    private final String identifier;
    private final long timestamp;

    public ByteSinkStream() {
        this("ByteSinkStream");
    }

    public ByteSinkStream(String identifier) {
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
        return "ByteSinkStream[" + identifier + "]";
    }
}
