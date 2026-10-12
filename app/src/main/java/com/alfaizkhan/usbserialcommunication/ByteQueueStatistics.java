package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Queue depth, occupancy and watermark metrics tracker.
 */
public final class ByteQueueStatistics {
    private final String identifier;
    private final long timestamp;

    public ByteQueueStatistics() {
        this("ByteQueueStatistics");
    }

    public ByteQueueStatistics(String identifier) {
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
        return "ByteQueueStatistics[" + identifier + "]";
    }
}
