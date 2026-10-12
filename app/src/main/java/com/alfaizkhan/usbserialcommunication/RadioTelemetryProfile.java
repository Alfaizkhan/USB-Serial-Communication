package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Pre-configured profile for wireless packet radios and XBee modules.
 */
public final class RadioTelemetryProfile {
    private final String identifier;
    private final long timestamp;

    public RadioTelemetryProfile() {
        this("RadioTelemetryProfile");
    }

    public RadioTelemetryProfile(String identifier) {
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
        return "RadioTelemetryProfile[" + identifier + "]";
    }
}
