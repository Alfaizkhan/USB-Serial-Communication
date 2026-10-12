package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Bytes-per-second serial payload transfer calculator.
 */
public final class ThroughputEstimatorBytesPerSec {
    private final String identifier;
    private final long timestamp;

    public ThroughputEstimatorBytesPerSec() {
        this("ThroughputEstimatorBytesPerSec");
    }

    public ThroughputEstimatorBytesPerSec(String identifier) {
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
        return "ThroughputEstimatorBytesPerSec[" + identifier + "]";
    }
}
