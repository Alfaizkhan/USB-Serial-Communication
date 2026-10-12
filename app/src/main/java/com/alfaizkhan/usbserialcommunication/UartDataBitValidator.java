package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 5, 6, 7, and 8 data bits per character validator.
 */
public final class UartDataBitValidator {
    private final String identifier;
    private final long timestamp;

    public UartDataBitValidator() {
        this("UartDataBitValidator");
    }

    public UartDataBitValidator(String identifier) {
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
        return "UartDataBitValidator[" + identifier + "]";
    }
}
