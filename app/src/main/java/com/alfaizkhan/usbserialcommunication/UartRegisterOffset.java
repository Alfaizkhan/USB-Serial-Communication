package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Standard 16550 UART register offset address definitions.
 */
public final class UartRegisterOffset {
    private final String identifier;
    private final long timestamp;

    public UartRegisterOffset() {
        this("UartRegisterOffset");
    }

    public UartRegisterOffset(String identifier) {
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
        return "UartRegisterOffset[" + identifier + "]";
    }
}
