package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * LIFO last-in first-out packet stack for diagnostics.
 */
public final class LifoPacketStack {
    private final String identifier;
    private final long timestamp;

    public LifoPacketStack() {
        this("LifoPacketStack");
    }

    public LifoPacketStack(String identifier) {
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
        return "LifoPacketStack[" + identifier + "]";
    }
}
