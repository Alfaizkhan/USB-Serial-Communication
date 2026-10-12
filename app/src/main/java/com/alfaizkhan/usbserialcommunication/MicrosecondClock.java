package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Microsecond resolution timestamp formatting utility.
 */
public final class MicrosecondClock {
    private final String identifier;
    private final long timestamp;

    public MicrosecondClock() {
        this("MicrosecondClock");
    }

    public MicrosecondClock(String identifier) {
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
        return "MicrosecondClock[" + identifier + "]";
    }
}
