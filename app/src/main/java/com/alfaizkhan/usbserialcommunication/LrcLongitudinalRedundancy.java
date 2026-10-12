package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * LRC Longitudinal Redundancy Check utility.
 */
public final class LrcLongitudinalRedundancy {
    private final String identifier;
    private final long timestamp;

    public LrcLongitudinalRedundancy() {
        this("LrcLongitudinalRedundancy");
    }

    public LrcLongitudinalRedundancy(String identifier) {
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
        return "LrcLongitudinalRedundancy[" + identifier + "]";
    }
}
