package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 1, 1.5, and 2 stop bits configuration validator.
 */
public final class UartStopBitValidator {
    private final String identifier;
    private final long timestamp;

    public UartStopBitValidator() {
        this("UartStopBitValidator");
    }

    public UartStopBitValidator(String identifier) {
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
        return "UartStopBitValidator[" + identifier + "]";
    }
}
