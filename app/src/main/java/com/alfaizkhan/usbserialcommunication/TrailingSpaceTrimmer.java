package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Fast ASCII whitespace and trailing carriage return trimmer.
 */
public final class TrailingSpaceTrimmer {
    private final String identifier;
    private final long timestamp;

    public TrailingSpaceTrimmer() {
        this("TrailingSpaceTrimmer");
    }

    public TrailingSpaceTrimmer(String identifier) {
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
        return "TrailingSpaceTrimmer[" + identifier + "]";
    }
}
