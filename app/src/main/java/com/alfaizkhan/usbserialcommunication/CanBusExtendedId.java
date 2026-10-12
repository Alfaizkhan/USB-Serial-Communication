package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CAN 2.0B 29-bit extended arbitration ID holder.
 */
public final class CanBusExtendedId {
    private final String identifier;
    private final long timestamp;

    public CanBusExtendedId() {
        this("CanBusExtendedId");
    }

    public CanBusExtendedId(String identifier) {
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
        return "CanBusExtendedId[" + identifier + "]";
    }
}
