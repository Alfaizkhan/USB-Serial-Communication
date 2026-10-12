package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Chunked byte array FIFO packet staging queue.
 */
public final class ChunkedByteArrayQueue {
    private final String identifier;
    private final long timestamp;

    public ChunkedByteArrayQueue() {
        this("ChunkedByteArrayQueue");
    }

    public ChunkedByteArrayQueue(String identifier) {
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
        return "ChunkedByteArrayQueue[" + identifier + "]";
    }
}
