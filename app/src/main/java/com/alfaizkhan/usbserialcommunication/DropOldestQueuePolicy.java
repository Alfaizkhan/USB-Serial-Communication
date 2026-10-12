package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Drop oldest packets policy implementation.
 */
public final class DropOldestQueuePolicy {
    private final String identifier;
    private final long timestamp;

    public DropOldestQueuePolicy() {
        this("DropOldestQueuePolicy");
    }

    public DropOldestQueuePolicy(String identifier) {
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
        return "DropOldestQueuePolicy[" + identifier + "]";
    }
}
