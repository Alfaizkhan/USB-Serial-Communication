package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * DB9 and DB25 pinout signal mapping constant definitions.
 */
public final class Rs232PinoutMapping {
    private final String identifier;
    private final long timestamp;

    public Rs232PinoutMapping() {
        this("Rs232PinoutMapping");
    }

    public Rs232PinoutMapping(String identifier) {
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
        return "Rs232PinoutMapping[" + identifier + "]";
    }
}
