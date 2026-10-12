package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Device USB serial number validation and sanitization.
 */
public final class UsbSerialNumberValidator {
    private final String identifier;
    private final long timestamp;

    public UsbSerialNumberValidator() {
        this("UsbSerialNumberValidator");
    }

    public UsbSerialNumberValidator(String identifier) {
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
        return "UsbSerialNumberValidator[" + identifier + "]";
    }
}
