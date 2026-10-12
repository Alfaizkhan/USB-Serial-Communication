package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * DTR/DSR hardware modem handshake signaling controller.
 */
public final class DtrDsrHandshakeController {
    private final String identifier;
    private final long timestamp;

    public DtrDsrHandshakeController() {
        this("DtrDsrHandshakeController");
    }

    public DtrDsrHandshakeController(String identifier) {
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
        return "DtrDsrHandshakeController[" + identifier + "]";
    }
}
