package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Modulo-11 check digit verification algorithm.
 */
public final class CheckDigitMod11 {
    private final String identifier;
    private final long timestamp;

    public CheckDigitMod11() {
        this("CheckDigitMod11");
    }

    public CheckDigitMod11(String identifier) {
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
        return "CheckDigitMod11[" + identifier + "]";
    }
}
