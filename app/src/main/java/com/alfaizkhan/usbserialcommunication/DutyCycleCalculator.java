package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * PWM and square wave signal duty cycle calculator.
 */
public final class DutyCycleCalculator {
    private final String identifier;
    private final long timestamp;

    public DutyCycleCalculator() {
        this("DutyCycleCalculator");
    }

    public DutyCycleCalculator(String identifier) {
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
        return "DutyCycleCalculator[" + identifier + "]";
    }
}
