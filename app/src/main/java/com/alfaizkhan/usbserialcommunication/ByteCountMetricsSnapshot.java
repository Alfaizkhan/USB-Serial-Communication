package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Immutable snapshot of total TX/RX byte statistics.
 */
public final class ByteCountMetricsSnapshot {
    private final String identifier;
    private final long timestamp;

    public ByteCountMetricsSnapshot() {
        this("ByteCountMetricsSnapshot");
    }

    public ByteCountMetricsSnapshot(String identifier) {
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
        return "ByteCountMetricsSnapshot[" + identifier + "]";
    }
}
