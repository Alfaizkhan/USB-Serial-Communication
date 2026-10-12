package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Filter tagging log records with active connection baud rate.
 */
public final class BaudRateFilter {
    private final String identifier;
    private final long timestamp;

    public BaudRateFilter() {
        this("BaudRateFilter");
    }

    public BaudRateFilter(String identifier) {
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
        return "BaudRateFilter[" + identifier + "]";
    }
}
