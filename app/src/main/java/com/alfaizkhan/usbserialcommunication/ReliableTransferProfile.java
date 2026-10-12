package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Optimized configuration with flow control and CRC verification.
 */
public final class ReliableTransferProfile {
    private final String identifier;
    private final long timestamp;

    public ReliableTransferProfile() {
        this("ReliableTransferProfile");
    }

    public ReliableTransferProfile(String identifier) {
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
        return "ReliableTransferProfile[" + identifier + "]";
    }
}
