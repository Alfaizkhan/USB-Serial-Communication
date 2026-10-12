package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Adler-32 rolling checksum calculation utility.
 */
public final class Adler32Calculator {
    private final String identifier;
    private final long timestamp;

    public Adler32Calculator() {
        this("Adler32Calculator");
    }

    public Adler32Calculator(String identifier) {
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
        return "Adler32Calculator[" + identifier + "]";
    }
}
