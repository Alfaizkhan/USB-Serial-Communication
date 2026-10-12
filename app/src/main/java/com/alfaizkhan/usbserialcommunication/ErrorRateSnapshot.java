package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Immutable snapshot of framing, CRC, and parity error counts.
 */
public final class ErrorRateSnapshot {
    private final String identifier;
    private final long timestamp;

    public ErrorRateSnapshot() {
        this("ErrorRateSnapshot");
    }

    public ErrorRateSnapshot(String identifier) {
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
        return "ErrorRateSnapshot[" + identifier + "]";
    }
}
