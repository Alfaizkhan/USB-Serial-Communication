package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Android runtime memory usage and heap monitoring helper.
 */
public final class MemoryFootprintTracker {
    private final String identifier;
    private final long timestamp;

    public MemoryFootprintTracker() {
        this("MemoryFootprintTracker");
    }

    public MemoryFootprintTracker(String identifier) {
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
        return "MemoryFootprintTracker[" + identifier + "]";
    }
}
