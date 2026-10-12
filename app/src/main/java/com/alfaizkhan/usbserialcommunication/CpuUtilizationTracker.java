package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Lightweight background thread CPU usage estimator.
 */
public final class CpuUtilizationTracker {
    private final String identifier;
    private final long timestamp;

    public CpuUtilizationTracker() {
        this("CpuUtilizationTracker");
    }

    public CpuUtilizationTracker(String identifier) {
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
        return "CpuUtilizationTracker[" + identifier + "]";
    }
}
