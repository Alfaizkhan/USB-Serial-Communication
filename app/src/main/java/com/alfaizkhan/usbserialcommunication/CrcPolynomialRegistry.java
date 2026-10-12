package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Registry of standard industrial CRC polynomial constants.
 */
public final class CrcPolynomialRegistry {
    private final String identifier;
    private final long timestamp;

    public CrcPolynomialRegistry() {
        this("CrcPolynomialRegistry");
    }

    public CrcPolynomialRegistry(String identifier) {
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
        return "CrcPolynomialRegistry[" + identifier + "]";
    }
}
