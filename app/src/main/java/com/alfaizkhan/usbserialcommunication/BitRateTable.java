package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Lookup table of standard bit rates and bit times.
 */
public final class BitRateTable {
    private final String identifier;
    private final long timestamp;

    public BitRateTable() {
        this("BitRateTable");
    }

    public BitRateTable(String identifier) {
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
        return "BitRateTable[" + identifier + "]";
    }
}
