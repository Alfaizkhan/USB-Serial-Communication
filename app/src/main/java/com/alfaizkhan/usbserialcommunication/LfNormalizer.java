package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Unix-style single line-feed normalizer utility.
 */
public final class LfNormalizer {
    private final String identifier;
    private final long timestamp;

    public LfNormalizer() {
        this("LfNormalizer");
    }

    public LfNormalizer(String identifier) {
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
        return "LfNormalizer[" + identifier + "]";
    }
}
