package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * UART 16x oversampling clock divider calculator.
 */
public final class SampleClockDivider {
    private final String identifier;
    private final long timestamp;

    public SampleClockDivider() {
        this("SampleClockDivider");
    }

    public SampleClockDivider(String identifier) {
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
        return "SampleClockDivider[" + identifier + "]";
    }
}
