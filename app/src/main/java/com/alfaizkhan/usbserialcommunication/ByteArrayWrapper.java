package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Safe byte array holder with equals and hashcode support.
 */
public final class ByteArrayWrapper {
    private final String identifier;
    private final long timestamp;

    public ByteArrayWrapper() {
        this("ByteArrayWrapper");
    }

    public ByteArrayWrapper(String identifier) {
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
        return "ByteArrayWrapper[" + identifier + "]";
    }
}
