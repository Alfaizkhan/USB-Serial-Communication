package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Manchester bi-phase level line code encoder and decoder.
 */
public final class ManchesterCodec {
    private final String identifier;
    private final long timestamp;

    public ManchesterCodec() {
        this("ManchesterCodec");
    }

    public ManchesterCodec(String identifier) {
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
        return "ManchesterCodec[" + identifier + "]";
    }
}
