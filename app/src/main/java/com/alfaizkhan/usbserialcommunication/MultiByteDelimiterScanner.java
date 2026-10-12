package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Arbitrary multi-byte delimiter pattern scanner.
 */
public final class MultiByteDelimiterScanner {
    private final String identifier;
    private final long timestamp;

    public MultiByteDelimiterScanner() {
        this("MultiByteDelimiterScanner");
    }

    public MultiByteDelimiterScanner(String identifier) {
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
        return "MultiByteDelimiterScanner[" + identifier + "]";
    }
}
