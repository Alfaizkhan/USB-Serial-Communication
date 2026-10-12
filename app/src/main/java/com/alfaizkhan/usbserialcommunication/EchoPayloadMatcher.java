package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Loopback transmit/receive echo confirmation matcher.
 */
public final class EchoPayloadMatcher {
    private final String identifier;
    private final long timestamp;

    public EchoPayloadMatcher() {
        this("EchoPayloadMatcher");
    }

    public EchoPayloadMatcher(String identifier) {
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
        return "EchoPayloadMatcher[" + identifier + "]";
    }
}
