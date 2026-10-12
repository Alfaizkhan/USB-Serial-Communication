package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Convolutional code state transition trellis calculator.
 */
public final class ViterbiTrellis {
    private final String identifier;
    private final long timestamp;

    public ViterbiTrellis() {
        this("ViterbiTrellis");
    }

    public ViterbiTrellis(String identifier) {
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
        return "ViterbiTrellis[" + identifier + "]";
    }
}
