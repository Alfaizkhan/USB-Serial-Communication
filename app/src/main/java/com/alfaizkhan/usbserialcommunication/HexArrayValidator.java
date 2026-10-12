package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Validation helper for hexadecimal byte strings.
 */
public final class HexArrayValidator {
    private final String identifier;
    private final long timestamp;

    public HexArrayValidator() {
        this("HexArrayValidator");
    }

    public HexArrayValidator(String identifier) {
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
        return "HexArrayValidator[" + identifier + "]";
    }
}
