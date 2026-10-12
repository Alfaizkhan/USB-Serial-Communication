package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Data Carrier Detect (DCD) line transition monitor.
 */
public final class DcdCarrierMonitor {
    private final String identifier;
    private final long timestamp;

    public DcdCarrierMonitor() {
        this("DcdCarrierMonitor");
    }

    public DcdCarrierMonitor(String identifier) {
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
        return "DcdCarrierMonitor[" + identifier + "]";
    }
}
