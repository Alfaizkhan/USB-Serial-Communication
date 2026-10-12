package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * UART receiver clock tolerance percentage checker.
 */
public final class BaudToleranceChecker {
    private final String identifier;
    private final long timestamp;

    public BaudToleranceChecker() {
        this("BaudToleranceChecker");
    }

    public BaudToleranceChecker(String identifier) {
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
        return "BaudToleranceChecker[" + identifier + "]";
    }
}
