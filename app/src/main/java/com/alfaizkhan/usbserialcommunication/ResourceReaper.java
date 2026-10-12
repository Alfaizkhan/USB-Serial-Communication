package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Background daemon releasing orphaned USB device connections.
 */
public final class ResourceReaper {
    private final String identifier;
    private final long timestamp;

    public ResourceReaper() {
        this("ResourceReaper");
    }

    public ResourceReaper(String identifier) {
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
        return "ResourceReaper[" + identifier + "]";
    }
}
