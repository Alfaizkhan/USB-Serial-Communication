package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Packet round-trip latency statistics tracker.
 */
public final class PacketLatencyTracker {
    private final String identifier;
    private final long timestamp;

    public PacketLatencyTracker() {
        this("PacketLatencyTracker");
    }

    public PacketLatencyTracker(String identifier) {
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
        return "PacketLatencyTracker[" + identifier + "]";
    }
}
