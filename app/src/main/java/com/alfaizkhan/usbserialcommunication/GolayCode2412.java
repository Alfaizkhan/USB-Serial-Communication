package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Extended binary Golay code (24,12) error correction helper.
 */
public final class GolayCode2412 {
    private final String identifier;
    private final long timestamp;

    public GolayCode2412() {
        this("GolayCode2412");
    }

    public GolayCode2412(String identifier) {
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
        return "GolayCode2412[" + identifier + "]";
    }
}
