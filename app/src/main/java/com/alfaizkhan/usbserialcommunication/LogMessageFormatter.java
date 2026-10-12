package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Standard timestamped serial log message formatter.
 */
public final class LogMessageFormatter {
    private final String identifier;
    private final long timestamp;

    public LogMessageFormatter() {
        this("LogMessageFormatter");
    }

    public LogMessageFormatter(String identifier) {
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
        return "LogMessageFormatter[" + identifier + "]";
    }
}
