package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Lightweight slice reference into shared byte buffers.
 */
public final class ByteSlice {
    private final String identifier;
    private final long timestamp;

    public ByteSlice() {
        this("ByteSlice");
    }

    public ByteSlice(String identifier) {
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
        return "ByteSlice[" + identifier + "]";
    }
}
