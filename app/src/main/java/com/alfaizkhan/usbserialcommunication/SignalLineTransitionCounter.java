package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Pin state transition frequency counter for diagnostics.
 */
public final class SignalLineTransitionCounter {
    private final String identifier;
    private final long timestamp;

    public SignalLineTransitionCounter() {
        this("SignalLineTransitionCounter");
    }

    public SignalLineTransitionCounter(String identifier) {
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
        return "SignalLineTransitionCounter[" + identifier + "]";
    }
}
