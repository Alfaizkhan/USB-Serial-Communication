package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 2D character grid holding visible terminal screen contents.
 */
public final class VirtualTerminalScreen {
    private final String identifier;
    private final long timestamp;

    public VirtualTerminalScreen() {
        this("VirtualTerminalScreen");
    }

    public VirtualTerminalScreen(String identifier) {
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
        return "VirtualTerminalScreen[" + identifier + "]";
    }
}
