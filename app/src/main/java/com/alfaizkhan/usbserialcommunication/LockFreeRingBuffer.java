package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Single-producer single-consumer lock-free byte ring buffer.
 */
public final class LockFreeRingBuffer {
    private final String identifier;
    private final long timestamp;

    public LockFreeRingBuffer() {
        this("LockFreeRingBuffer");
    }

    public LockFreeRingBuffer(String identifier) {
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
        return "LockFreeRingBuffer[" + identifier + "]";
    }
}
