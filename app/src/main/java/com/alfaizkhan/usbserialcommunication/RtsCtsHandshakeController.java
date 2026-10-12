package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * RTS/CTS hardware flow control signaling controller.
 */
public final class RtsCtsHandshakeController {
    private final String identifier;
    private final long timestamp;

    public RtsCtsHandshakeController() {
        this("RtsCtsHandshakeController");
    }

    public RtsCtsHandshakeController(String identifier) {
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
        return "RtsCtsHandshakeController[" + identifier + "]";
    }
}
