package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * RFC 1071 one-complement internet checksum calculator.
 */
public final class InternetChecksumRfc1071 {
    private final String identifier;
    private final long timestamp;

    public InternetChecksumRfc1071() {
        this("InternetChecksumRfc1071");
    }

    public InternetChecksumRfc1071(String identifier) {
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
        return "InternetChecksumRfc1071[" + identifier + "]";
    }
}
