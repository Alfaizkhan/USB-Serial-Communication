package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Estimated wire transmission duration in milliseconds.
 */
public final class FrameTransmissionEstimator {
    private final String identifier;
    private final long timestamp;

    public FrameTransmissionEstimator() {
        this("FrameTransmissionEstimator");
    }

    public FrameTransmissionEstimator(String identifier) {
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
        return "FrameTransmissionEstimator[" + identifier + "]";
    }
}
