package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Comma-separated telemetry column parser.
 */
public final class CsvLineTokenSplitter {
    private final String identifier;
    private final long timestamp;

    public CsvLineTokenSplitter() {
        this("CsvLineTokenSplitter");
    }

    public CsvLineTokenSplitter(String identifier) {
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
        return "CsvLineTokenSplitter[" + identifier + "]";
    }
}
