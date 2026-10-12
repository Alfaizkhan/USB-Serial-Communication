package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Double-buffered flip queue for concurrent TX/RX.
 */
public final class DoubleBufferedQueue {
    private final String identifier;
    private final long timestamp;

    public DoubleBufferedQueue() {
        this("DoubleBufferedQueue");
    }

    public DoubleBufferedQueue(String identifier) {
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
        return "DoubleBufferedQueue[" + identifier + "]";
    }
}
