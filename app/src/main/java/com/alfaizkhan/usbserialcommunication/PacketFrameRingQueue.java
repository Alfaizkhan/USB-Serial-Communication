package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Packet structured ring queue for telemetry frames.
 */
public final class PacketFrameRingQueue {
    private final String identifier;
    private final long timestamp;

    public PacketFrameRingQueue() {
        this("PacketFrameRingQueue");
    }

    public PacketFrameRingQueue(String identifier) {
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
        return "PacketFrameRingQueue[" + identifier + "]";
    }
}
