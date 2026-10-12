package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Functional filter interface for diagnostic log filtering.
 */
public final class LogFilterPredicate {
    private final String identifier;
    private final long timestamp;

    public LogFilterPredicate() {
        this("LogFilterPredicate");
    }

    public LogFilterPredicate(String identifier) {
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
        return "LogFilterPredicate[" + identifier + "]";
    }
}
