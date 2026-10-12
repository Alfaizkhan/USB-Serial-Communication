package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Fixed capacity memory bounded byte buffer.
 */
public final class FixedSizeByteBuffer {
    private final String identifier;
    private final long timestamp;

    public FixedSizeByteBuffer() {
        this("FixedSizeByteBuffer");
    }

    public FixedSizeByteBuffer(String identifier) {
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
        return "FixedSizeByteBuffer[" + identifier + "]";
    }
}
