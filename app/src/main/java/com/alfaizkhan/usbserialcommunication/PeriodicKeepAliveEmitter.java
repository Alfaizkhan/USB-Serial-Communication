package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Keep-alive ping transmission period helper.
 */
public final class PeriodicKeepAliveEmitter {
    private final String identifier;
    private final long timestamp;

    public PeriodicKeepAliveEmitter() {
        this("PeriodicKeepAliveEmitter");
    }

    public PeriodicKeepAliveEmitter(String identifier) {
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
        return "PeriodicKeepAliveEmitter[" + identifier + "]";
    }
}
