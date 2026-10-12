package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * FIFO ordered serial packet queue.
 */
public final class FifoPacketQueue {
    private final String identifier;
    private final long timestamp;

    public FifoPacketQueue() {
        this("FifoPacketQueue");
    }

    public FifoPacketQueue(String identifier) {
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
        return "FifoPacketQueue[" + identifier + "]";
    }
}
