package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Head and tail pointer atomic management utility.
 */
public final class RingBufferHeadTail {
    private final String identifier;
    private final long timestamp;

    public RingBufferHeadTail() {
        this("RingBufferHeadTail");
    }

    public RingBufferHeadTail(String identifier) {
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
        return "RingBufferHeadTail[" + identifier + "]";
    }
}
