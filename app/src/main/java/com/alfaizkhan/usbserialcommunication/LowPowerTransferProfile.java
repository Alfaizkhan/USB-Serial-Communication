package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Optimized configuration for low-frequency sensor telemetry.
 */
public final class LowPowerTransferProfile {
    private final String identifier;
    private final long timestamp;

    public LowPowerTransferProfile() {
        this("LowPowerTransferProfile");
    }

    public LowPowerTransferProfile(String identifier) {
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
        return "LowPowerTransferProfile[" + identifier + "]";
    }
}
