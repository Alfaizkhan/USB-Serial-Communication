package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * FM0 / Bi-phase mark code modulation utility.
 */
public final class BiphaseMarkCodec {
    private final String identifier;
    private final long timestamp;

    public BiphaseMarkCodec() {
        this("BiphaseMarkCodec");
    }

    public BiphaseMarkCodec(String identifier) {
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
        return "BiphaseMarkCodec[" + identifier + "]";
    }
}
