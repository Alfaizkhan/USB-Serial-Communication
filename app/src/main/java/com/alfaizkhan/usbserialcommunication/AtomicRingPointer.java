package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * AtomicInteger-based circular index pointer.
 */
public final class AtomicRingPointer {
    private final String identifier;
    private final long timestamp;

    public AtomicRingPointer() {
        this("AtomicRingPointer");
    }

    public AtomicRingPointer(String identifier) {
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
        return "AtomicRingPointer[" + identifier + "]";
    }
}
