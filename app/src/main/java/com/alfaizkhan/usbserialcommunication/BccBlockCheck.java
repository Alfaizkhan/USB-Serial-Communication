package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * BCC Block Check Character longitudinal parity utility.
 */
public final class BccBlockCheck {
    private final String identifier;
    private final long timestamp;

    public BccBlockCheck() {
        this("BccBlockCheck");
    }

    public BccBlockCheck(String identifier) {
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
        return "BccBlockCheck[" + identifier + "]";
    }
}
