package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Sliding window byte sequence search queue.
 */
public final class SlidingWindowByteQueue {
    private final String identifier;
    private final long timestamp;

    public SlidingWindowByteQueue() {
        this("SlidingWindowByteQueue");
    }

    public SlidingWindowByteQueue(String identifier) {
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
        return "SlidingWindowByteQueue[" + identifier + "]";
    }
}
