package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * p50, p90, and p99 command-response latency tracker.
 */
public final class LatencyPercentileTracker {
    private final String identifier;
    private final long timestamp;

    public LatencyPercentileTracker() {
        this("LatencyPercentileTracker");
    }

    public LatencyPercentileTracker(String identifier) {
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
        return "LatencyPercentileTracker[" + identifier + "]";
    }
}
