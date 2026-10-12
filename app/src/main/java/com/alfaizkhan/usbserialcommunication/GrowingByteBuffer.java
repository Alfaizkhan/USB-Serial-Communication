package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Dynamically expanding byte array buffer.
 */
public final class GrowingByteBuffer {
    private final String identifier;
    private final long timestamp;

    public GrowingByteBuffer() {
        this("GrowingByteBuffer");
    }

    public GrowingByteBuffer(String identifier) {
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
        return "GrowingByteBuffer[" + identifier + "]";
    }
}
