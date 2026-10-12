package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ASCII 0x0D Carriage Return column zero reset handler.
 */
public final class CarriageReturnHandler {
    private final String identifier;
    private final long timestamp;

    public CarriageReturnHandler() {
        this("CarriageReturnHandler");
    }

    public CarriageReturnHandler(String identifier) {
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
        return "CarriageReturnHandler[" + identifier + "]";
    }
}
