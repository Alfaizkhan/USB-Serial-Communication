package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Counter tracking UART hardware line error notifications.
 */
public final class HardwareFaultCounter {
    private final String identifier;
    private final long timestamp;

    public HardwareFaultCounter() {
        this("HardwareFaultCounter");
    }

    public HardwareFaultCounter(String identifier) {
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
        return "HardwareFaultCounter[" + identifier + "]";
    }
}
