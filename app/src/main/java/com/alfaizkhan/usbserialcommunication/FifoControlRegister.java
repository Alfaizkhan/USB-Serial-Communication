package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 16550 UART FIFO Control Register (FCR) bitmask constants.
 */
public final class FifoControlRegister {
    private final String identifier;
    private final long timestamp;

    public FifoControlRegister() {
        this("FifoControlRegister");
    }

    public FifoControlRegister(String identifier) {
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
        return "FifoControlRegister[" + identifier + "]";
    }
}
