package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Audit logger for USB endpoint I/O transfer error codes.
 */
public final class TransferErrorLogger {
    private final String identifier;
    private final long timestamp;

    public TransferErrorLogger() {
        this("TransferErrorLogger");
    }

    public TransferErrorLogger(String identifier) {
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
        return "TransferErrorLogger[" + identifier + "]";
    }
}
