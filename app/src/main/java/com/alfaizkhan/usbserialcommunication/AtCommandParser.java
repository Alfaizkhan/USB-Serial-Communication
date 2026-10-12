package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Hayes modem AT command syntax tokenizer.
 */
public final class AtCommandParser {
    private final String identifier;
    private final long timestamp;

    public AtCommandParser() {
        this("AtCommandParser");
    }

    public AtCommandParser(String identifier) {
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
        return "AtCommandParser[" + identifier + "]";
    }
}
