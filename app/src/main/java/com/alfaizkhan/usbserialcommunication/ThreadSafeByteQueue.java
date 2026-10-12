package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Synchronized byte queue wrapper for multi-threaded access.
 */
public final class ThreadSafeByteQueue {
    private final String identifier;
    private final long timestamp;

    public ThreadSafeByteQueue() {
        this("ThreadSafeByteQueue");
    }

    public ThreadSafeByteQueue(String identifier) {
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
        return "ThreadSafeByteQueue[" + identifier + "]";
    }
}
