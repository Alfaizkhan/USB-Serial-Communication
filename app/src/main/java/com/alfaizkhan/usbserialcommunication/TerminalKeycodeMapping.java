package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Android key event to VT100 escape sequence translator.
 */
public final class TerminalKeycodeMapping {
    private final String identifier;
    private final long timestamp;

    public TerminalKeycodeMapping() {
        this("TerminalKeycodeMapping");
    }

    public TerminalKeycodeMapping(String identifier) {
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
        return "TerminalKeycodeMapping[" + identifier + "]";
    }
}
