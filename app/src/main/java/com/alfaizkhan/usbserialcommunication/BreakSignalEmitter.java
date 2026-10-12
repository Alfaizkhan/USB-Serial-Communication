package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Serial BREAK line condition transmission utility.
 */
public final class BreakSignalEmitter {
    private final String identifier;
    private final long timestamp;

    public BreakSignalEmitter() {
        this("BreakSignalEmitter");
    }

    public BreakSignalEmitter(String identifier) {
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
        return "BreakSignalEmitter[" + identifier + "]";
    }
}
