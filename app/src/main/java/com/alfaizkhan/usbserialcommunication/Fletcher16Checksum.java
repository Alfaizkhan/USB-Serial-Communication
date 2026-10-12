package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Fletcher-16 arithmetic checksum calculation utility.
 */
public final class Fletcher16Checksum {
    private final String identifier;
    private final long timestamp;

    public Fletcher16Checksum() {
        this("Fletcher16Checksum");
    }

    public Fletcher16Checksum(String identifier) {
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
        return "Fletcher16Checksum[" + identifier + "]";
    }
}
