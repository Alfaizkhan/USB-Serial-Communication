package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * General frame check sequence validation wrapper.
 */
public final class FrameCheckSequence {
    private final String identifier;
    private final long timestamp;

    public FrameCheckSequence() {
        this("FrameCheckSequence");
    }

    public FrameCheckSequence(String identifier) {
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
        return "FrameCheckSequence[" + identifier + "]";
    }
}
