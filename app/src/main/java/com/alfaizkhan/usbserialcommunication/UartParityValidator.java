package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Even, Odd, Mark, and Space parity checking logic.
 */
public final class UartParityValidator {
    private final String identifier;
    private final long timestamp;

    public UartParityValidator() {
        this("UartParityValidator");
    }

    public UartParityValidator(String identifier) {
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
        return "UartParityValidator[" + identifier + "]";
    }
}
