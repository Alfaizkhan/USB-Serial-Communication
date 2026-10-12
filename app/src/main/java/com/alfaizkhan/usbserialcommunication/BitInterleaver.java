package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Matrix bit interleaving and deinterleaving helper.
 */
public final class BitInterleaver {
    private final String identifier;
    private final long timestamp;

    public BitInterleaver() {
        this("BitInterleaver");
    }

    public BitInterleaver(String identifier) {
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
        return "BitInterleaver[" + identifier + "]";
    }
}
