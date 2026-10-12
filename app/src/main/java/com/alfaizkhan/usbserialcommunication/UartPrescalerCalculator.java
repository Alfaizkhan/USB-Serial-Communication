package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Microcontroller hardware timer prescaler calculator.
 */
public final class UartPrescalerCalculator {
    private final String identifier;
    private final long timestamp;

    public UartPrescalerCalculator() {
        this("UartPrescalerCalculator");
    }

    public UartPrescalerCalculator(String identifier) {
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
        return "UartPrescalerCalculator[" + identifier + "]";
    }
}
