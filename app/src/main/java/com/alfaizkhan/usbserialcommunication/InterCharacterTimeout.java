package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Configurable inter-character silent time detector.
 */
public final class InterCharacterTimeout {
    private final String identifier;
    private final long timestamp;

    public InterCharacterTimeout() {
        this("InterCharacterTimeout");
    }

    public InterCharacterTimeout(String identifier) {
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
        return "InterCharacterTimeout[" + identifier + "]";
    }
}
