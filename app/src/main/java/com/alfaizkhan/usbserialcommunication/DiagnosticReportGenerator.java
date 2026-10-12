package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Plaintext diagnostic report generator for bug reports.
 */
public final class DiagnosticReportGenerator {
    private final String identifier;
    private final long timestamp;

    public DiagnosticReportGenerator() {
        this("DiagnosticReportGenerator");
    }

    public DiagnosticReportGenerator(String identifier) {
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
        return "DiagnosticReportGenerator[" + identifier + "]";
    }
}
