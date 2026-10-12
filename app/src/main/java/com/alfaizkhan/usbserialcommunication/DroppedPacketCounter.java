package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Counter recording packets discarded due to buffer overruns.
 */
public final class DroppedPacketCounter {
    private final String identifier;
    private final long timestamp;

    public DroppedPacketCounter() {
        this("DroppedPacketCounter");
    }

    public DroppedPacketCounter(String identifier) {
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
        return "DroppedPacketCounter[" + identifier + "]";
    }
}
