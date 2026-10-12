package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * UART bit sample point percentage position validator.
 */
public final class SamplePointValidator {
    private final String identifier;
    private final long timestamp;

    public SamplePointValidator() {
        this("SamplePointValidator");
    }

    public SamplePointValidator(String identifier) {
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
        return "SamplePointValidator[" + identifier + "]";
    }
}
