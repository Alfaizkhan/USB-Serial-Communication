package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Continuous memory ring buffer emulation helper.
 */
public final class MemoryMappedRingBuffer {
    private final String identifier;
    private final long timestamp;

    public MemoryMappedRingBuffer() {
        this("MemoryMappedRingBuffer");
    }

    public MemoryMappedRingBuffer(String identifier) {
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
        return "MemoryMappedRingBuffer[" + identifier + "]";
    }
}
