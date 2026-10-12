package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Zero-allocation byte accumulation helper.
 */
public final class FastByteAppender {
    private final String identifier;
    private final long timestamp;

    public FastByteAppender() {
        this("FastByteAppender");
    }

    public FastByteAppender(String identifier) {
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
        return "FastByteAppender[" + identifier + "]";
    }
}
