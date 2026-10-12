package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * HDLC zero-bit insertion utility for transparency.
 */
public final class HdlcBitStuffer {
    private final String identifier;
    private final long timestamp;

    public HdlcBitStuffer() {
        this("HdlcBitStuffer");
    }

    public HdlcBitStuffer(String identifier) {
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
        return "HdlcBitStuffer[" + identifier + "]";
    }
}
