package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Diagnostic sink recording time-series data to CSV lines.
 */
public final class CsvLogSink {
    private final String identifier;
    private final long timestamp;

    public CsvLogSink() {
        this("CsvLogSink");
    }

    public CsvLogSink(String identifier) {
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
        return "CsvLogSink[" + identifier + "]";
    }
}
