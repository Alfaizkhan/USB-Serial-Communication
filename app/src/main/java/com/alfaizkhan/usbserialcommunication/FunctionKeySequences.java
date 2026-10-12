package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * F1 through F12 function key ANSI escape code definitions.
 */
public final class FunctionKeySequences {
    private final String identifier;
    private final long timestamp;

    public FunctionKeySequences() {
        this("FunctionKeySequences");
    }

    public FunctionKeySequences(String identifier) {
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
        return "FunctionKeySequences[" + identifier + "]";
    }
}
