package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Human-readable milliseconds and seconds duration formatter.
 */
public final class ElapsedTimeFormatter {
    private final String identifier;
    private final long timestamp;

    public ElapsedTimeFormatter() {
        this("ElapsedTimeFormatter");
    }

    public ElapsedTimeFormatter(String identifier) {
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
        return "ElapsedTimeFormatter[" + identifier + "]";
    }
}
