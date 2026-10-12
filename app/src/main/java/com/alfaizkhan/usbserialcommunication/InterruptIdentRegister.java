package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 16550 UART Interrupt Identification Register (IIR) constants.
 */
public final class InterruptIdentRegister {
    private final String identifier;
    private final long timestamp;

    public InterruptIdentRegister() {
        this("InterruptIdentRegister");
    }

    public InterruptIdentRegister(String identifier) {
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
        return "InterruptIdentRegister[" + identifier + "]";
    }
}
