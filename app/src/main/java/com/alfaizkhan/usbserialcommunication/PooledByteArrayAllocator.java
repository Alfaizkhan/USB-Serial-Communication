package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Object pool allocator minimizing GC pressure on Android.
 */
public final class PooledByteArrayAllocator {
    private final String identifier;
    private final long timestamp;

    public PooledByteArrayAllocator() {
        this("PooledByteArrayAllocator");
    }

    public PooledByteArrayAllocator(String identifier) {
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
        return "PooledByteArrayAllocator[" + identifier + "]";
    }
}
