package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * HDLC zero-bit removal decoder utility.
 */
public final class HdlcBitUnstuffer {
    private final String identifier;
    private final long timestamp;

    public HdlcBitUnstuffer() {
        this("HdlcBitUnstuffer");
    }

    public HdlcBitUnstuffer(String identifier) {
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
        return "HdlcBitUnstuffer[" + identifier + "]";
    }
}
