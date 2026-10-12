package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Visual and audible bell signal notification dispatcher.
 */
public final class BellCharacterHandler {
    private final String identifier;
    private final long timestamp;

    public BellCharacterHandler() {
        this("BellCharacterHandler");
    }

    public BellCharacterHandler(String identifier) {
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
        return "BellCharacterHandler[" + identifier + "]";
    }
}
