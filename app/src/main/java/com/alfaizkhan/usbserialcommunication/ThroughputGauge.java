package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Current transmission throughput instantaneous rate gauge.
 */
public final class ThroughputGauge {
    private final String identifier;
    private final long timestamp;

    public ThroughputGauge() {
        this("ThroughputGauge");
    }

    public ThroughputGauge(String identifier) {
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
        return "ThroughputGauge[" + identifier + "]";
    }
}
