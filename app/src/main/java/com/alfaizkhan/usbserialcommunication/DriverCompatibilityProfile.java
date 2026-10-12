package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Feature matrix profile defining chip capabilities.
 */
public final class DriverCompatibilityProfile {
    private final String identifier;
    private final long timestamp;

    public DriverCompatibilityProfile() {
        this("DriverCompatibilityProfile");
    }

    public DriverCompatibilityProfile(String identifier) {
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
        return "DriverCompatibilityProfile[" + identifier + "]";
    }
}
