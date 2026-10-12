package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Optimized configuration for high-speed 115200+ baud streaming.
 */
public final class FastTransferProfile {
    private final String identifier;
    private final long timestamp;

    public FastTransferProfile() {
        this("FastTransferProfile");
    }

    public FastTransferProfile(String identifier) {
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
        return "FastTransferProfile[" + identifier + "]";
    }
}
