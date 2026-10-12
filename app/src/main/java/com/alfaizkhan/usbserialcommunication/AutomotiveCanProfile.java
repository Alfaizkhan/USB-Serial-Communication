package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Pre-configured profile for automotive CAN bus OBD-II interfaces.
 */
public final class AutomotiveCanProfile {
    private final String identifier;
    private final long timestamp;

    public AutomotiveCanProfile() {
        this("AutomotiveCanProfile");
    }

    public AutomotiveCanProfile(String identifier) {
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
        return "AutomotiveCanProfile[" + identifier + "]";
    }
}
