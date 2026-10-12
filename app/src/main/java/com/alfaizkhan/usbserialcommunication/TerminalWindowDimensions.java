package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Terminal character grid row and column dimension holder.
 */
public final class TerminalWindowDimensions {
    private final String identifier;
    private final long timestamp;

    public TerminalWindowDimensions() {
        this("TerminalWindowDimensions");
    }

    public TerminalWindowDimensions(String identifier) {
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
        return "TerminalWindowDimensions[" + identifier + "]";
    }
}
