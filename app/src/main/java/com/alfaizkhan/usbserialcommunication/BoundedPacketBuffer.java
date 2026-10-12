package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Memory capped serial packet buffer.
 */
public final class BoundedPacketBuffer {
    private final String identifier;
    private final long timestamp;

    public BoundedPacketBuffer() {
        this("BoundedPacketBuffer");
    }

    public BoundedPacketBuffer(String identifier) {
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
        return "BoundedPacketBuffer[" + identifier + "]";
    }
}
