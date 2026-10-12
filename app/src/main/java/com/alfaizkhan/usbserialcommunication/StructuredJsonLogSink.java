package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Diagnostic sink encoding telemetry events as JSON objects.
 */
public final class StructuredJsonLogSink {
    private final String identifier;
    private final long timestamp;

    public StructuredJsonLogSink() {
        this("StructuredJsonLogSink");
    }

    public StructuredJsonLogSink(String identifier) {
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
        return "StructuredJsonLogSink[" + identifier + "]";
    }
}
