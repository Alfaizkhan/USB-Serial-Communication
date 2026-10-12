package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * ANSI terminal screen clear sequence helper.
 */
public final class AnsiClearScreenCode {
    private final String identifier;
    private final long timestamp;

    public AnsiClearScreenCode() {
        this("AnsiClearScreenCode");
    }

    public AnsiClearScreenCode(String identifier) {
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
        return "AnsiClearScreenCode[" + identifier + "]";
    }
}
