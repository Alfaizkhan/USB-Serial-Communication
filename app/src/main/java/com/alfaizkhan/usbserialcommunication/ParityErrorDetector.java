package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * UART character parity mismatch error detector.
 */
public final class ParityErrorDetector {
    private final String identifier;
    private final long timestamp;

    public ParityErrorDetector() {
        this("ParityErrorDetector");
    }

    public ParityErrorDetector(String identifier) {
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
        return "ParityErrorDetector[" + identifier + "]";
    }
}
