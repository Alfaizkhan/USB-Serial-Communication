package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Pre-configured profile for GPS NMEA 0183 4800/9600 baud modules.
 */
public final class GpsTelemetryProfile {
    private final String identifier;
    private final long timestamp;

    public GpsTelemetryProfile() {
        this("GpsTelemetryProfile");
    }

    public GpsTelemetryProfile(String identifier) {
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
        return "GpsTelemetryProfile[" + identifier + "]";
    }
}
