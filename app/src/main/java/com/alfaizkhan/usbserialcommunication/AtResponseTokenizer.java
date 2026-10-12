package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Modem OK/ERROR/CONNECT response parser.
 */
public final class AtResponseTokenizer {
    private final String identifier;
    private final long timestamp;

    public AtResponseTokenizer() {
        this("AtResponseTokenizer");
    }

    public AtResponseTokenizer(String identifier) {
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
        return "AtResponseTokenizer[" + identifier + "]";
    }
}
