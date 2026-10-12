package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * End-of-line carriage-return line-feed normalizer.
 */
public final class CrLfNormalizer {
    private final String identifier;
    private final long timestamp;

    public CrLfNormalizer() {
        this("CrLfNormalizer");
    }

    public CrLfNormalizer(String identifier) {
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
        return "CrLfNormalizer[" + identifier + "]";
    }
}
