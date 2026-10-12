package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Validation helper for non-standard UART baud rates.
 */
public final class CustomBaudRateValidator {
    private final String identifier;
    private final long timestamp;

    public CustomBaudRateValidator() {
        this("CustomBaudRateValidator");
    }

    public CustomBaudRateValidator(String identifier) {
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
        return "CustomBaudRateValidator[" + identifier + "]";
    }
}
