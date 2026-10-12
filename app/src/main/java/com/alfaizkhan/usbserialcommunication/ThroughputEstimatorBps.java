package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Bits-per-second baud throughput calculation utility.
 */
public final class ThroughputEstimatorBps {
    private final String identifier;
    private final long timestamp;

    public ThroughputEstimatorBps() {
        this("ThroughputEstimatorBps");
    }

    public ThroughputEstimatorBps(String identifier) {
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
        return "ThroughputEstimatorBps[" + identifier + "]";
    }
}
