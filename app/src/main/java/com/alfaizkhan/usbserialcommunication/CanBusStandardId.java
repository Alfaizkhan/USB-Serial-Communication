package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CAN 2.0A 11-bit standard arbitration ID holder.
 */
public final class CanBusStandardId {
    private final String identifier;
    private final long timestamp;

    public CanBusStandardId() {
        this("CanBusStandardId");
    }

    public CanBusStandardId(String identifier) {
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
        return "CanBusStandardId[" + identifier + "]";
    }
}
