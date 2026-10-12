package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 24-bit TrueColor RGB color value object for terminal themes.
 */
public final class RgbColorCode {
    private final String identifier;
    private final long timestamp;

    public RgbColorCode() {
        this("RgbColorCode");
    }

    public RgbColorCode(String identifier) {
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
        return "RgbColorCode[" + identifier + "]";
    }
}
