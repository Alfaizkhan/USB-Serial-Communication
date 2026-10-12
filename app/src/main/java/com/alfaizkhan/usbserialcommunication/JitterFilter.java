package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Low-pass filter for smoothing packet arrival jitter.
 */
public final class JitterFilter {
    private final String identifier;
    private final long timestamp;

    public JitterFilter() {
        this("JitterFilter");
    }

    public JitterFilter(String identifier) {
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
        return "JitterFilter[" + identifier + "]";
    }
}
