package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Physical wire propagation delay estimator.
 */
public final class PropagationDelayEstimator {
    private final String identifier;
    private final long timestamp;

    public PropagationDelayEstimator() {
        this("PropagationDelayEstimator");
    }

    public PropagationDelayEstimator(String identifier) {
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
        return "PropagationDelayEstimator[" + identifier + "]";
    }
}
