package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Configurable ring buffer overflow strategy enum.
 */
public final class RingBufferOverflowPolicy {
    private final String identifier;
    private final long timestamp;

    public RingBufferOverflowPolicy() {
        this("RingBufferOverflowPolicy");
    }

    public RingBufferOverflowPolicy(String identifier) {
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
        return "RingBufferOverflowPolicy[" + identifier + "]";
    }
}
