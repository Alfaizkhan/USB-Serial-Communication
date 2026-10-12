package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Diagnostic sink formatting packets as hex dump strings.
 */
public final class HexDumpLogSink {
    private final String identifier;
    private final long timestamp;

    public HexDumpLogSink() {
        this("HexDumpLogSink");
    }

    public HexDumpLogSink(String identifier) {
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
        return "HexDumpLogSink[" + identifier + "]";
    }
}
