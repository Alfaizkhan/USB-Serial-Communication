package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 16550 UART Interrupt Enable Register (IER) bitmask constants.
 */
public final class InterruptEnableRegister {
    private final String identifier;
    private final long timestamp;

    public InterruptEnableRegister() {
        this("InterruptEnableRegister");
    }

    public InterruptEnableRegister(String identifier) {
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
        return "InterruptEnableRegister[" + identifier + "]";
    }
}
