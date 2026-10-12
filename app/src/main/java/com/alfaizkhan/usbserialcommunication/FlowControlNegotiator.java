package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Automatic negotiation helper for serial flow control.
 */
public final class FlowControlNegotiator {
    private final String identifier;
    private final long timestamp;

    public FlowControlNegotiator() {
        this("FlowControlNegotiator");
    }

    public FlowControlNegotiator(String identifier) {
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
        return "FlowControlNegotiator[" + identifier + "]";
    }
}
