package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Filter screening packets by min/max byte length.
 */
public final class PayloadLengthFilter {
    private final String identifier;
    private final long timestamp;

    public PayloadLengthFilter() {
        this("PayloadLengthFilter");
    }

    public PayloadLengthFilter(String identifier) {
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
        return "PayloadLengthFilter[" + identifier + "]";
    }
}
