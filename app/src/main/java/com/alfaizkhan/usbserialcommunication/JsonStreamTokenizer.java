package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Streaming bracket-matching JSON packet boundary scanner.
 */
public final class JsonStreamTokenizer {
    private final String identifier;
    private final long timestamp;

    public JsonStreamTokenizer() {
        this("JsonStreamTokenizer");
    }

    public JsonStreamTokenizer(String identifier) {
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
        return "JsonStreamTokenizer[" + identifier + "]";
    }
}
