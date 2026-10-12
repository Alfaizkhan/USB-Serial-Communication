package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Separate transmit and receive packet counter accumulator.
 */
public final class TxRxPacketCounter {
    private final String identifier;
    private final long timestamp;

    public TxRxPacketCounter() {
        this("TxRxPacketCounter");
    }

    public TxRxPacketCounter(String identifier) {
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
        return "TxRxPacketCounter[" + identifier + "]";
    }
}
