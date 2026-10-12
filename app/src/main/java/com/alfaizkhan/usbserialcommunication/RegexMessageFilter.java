package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Regular expression matching filter for serial text streams.
 */
public final class RegexMessageFilter {
    private final String identifier;
    private final long timestamp;

    public RegexMessageFilter() {
        this("RegexMessageFilter");
    }

    public RegexMessageFilter(String identifier) {
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
        return "RegexMessageFilter[" + identifier + "]";
    }
}
