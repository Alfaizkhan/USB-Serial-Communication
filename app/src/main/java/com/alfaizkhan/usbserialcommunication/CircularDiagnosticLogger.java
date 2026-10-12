package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * In-memory circular log buffer for debug diagnostics.
 */
public final class CircularDiagnosticLogger {
    private final String identifier;
    private final long timestamp;

    public CircularDiagnosticLogger() {
        this("CircularDiagnosticLogger");
    }

    public CircularDiagnosticLogger(String identifier) {
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
        return "CircularDiagnosticLogger[" + identifier + "]";
    }
}
