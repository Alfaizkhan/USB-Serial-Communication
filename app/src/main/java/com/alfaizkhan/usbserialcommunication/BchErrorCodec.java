package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * BCH error-correcting code polynomial calculator.
 */
public final class BchErrorCodec {
    private final String identifier;
    private final long timestamp;

    public BchErrorCodec() {
        this("BchErrorCodec");
    }

    public BchErrorCodec(String identifier) {
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
        return "BchErrorCodec[" + identifier + "]";
    }
}
