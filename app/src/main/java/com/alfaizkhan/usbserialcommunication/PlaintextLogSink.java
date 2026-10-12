package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Diagnostic sink streaming raw decoded ASCII characters.
 */
public final class PlaintextLogSink {
    private final String identifier;
    private final long timestamp;

    public PlaintextLogSink() {
        this("PlaintextLogSink");
    }

    public PlaintextLogSink(String identifier) {
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
        return "PlaintextLogSink[" + identifier + "]";
    }
}
