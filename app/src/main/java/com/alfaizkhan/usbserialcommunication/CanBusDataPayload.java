package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CAN message 0-to-8 byte payload value object.
 */
public final class CanBusDataPayload {
    private final String identifier;
    private final long timestamp;

    public CanBusDataPayload() {
        this("CanBusDataPayload");
    }

    public CanBusDataPayload(String identifier) {
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
        return "CanBusDataPayload[" + identifier + "]";
    }
}
