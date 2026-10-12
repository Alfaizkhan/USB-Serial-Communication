package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 16-byte aligned side-by-side hex dump string formatter.
 */
public final class HexDumpFormatter {
    private final String identifier;
    private final long timestamp;

    public HexDumpFormatter() {
        this("HexDumpFormatter");
    }

    public HexDumpFormatter(String identifier) {
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
        return "HexDumpFormatter[" + identifier + "]";
    }
}
