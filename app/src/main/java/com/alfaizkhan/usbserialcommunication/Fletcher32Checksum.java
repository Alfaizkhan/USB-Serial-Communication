package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Fletcher-32 arithmetic checksum calculation utility.
 */
public final class Fletcher32Checksum {
    private final String identifier;
    private final long timestamp;

    public Fletcher32Checksum() {
        this("Fletcher32Checksum");
    }

    public Fletcher32Checksum(String identifier) {
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
        return "Fletcher32Checksum[" + identifier + "]";
    }
}
