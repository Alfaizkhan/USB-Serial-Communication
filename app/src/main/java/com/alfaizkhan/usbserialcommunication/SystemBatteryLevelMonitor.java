package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Android battery change listener to optimize polling intervals.
 */
public final class SystemBatteryLevelMonitor {
    private final String identifier;
    private final long timestamp;

    public SystemBatteryLevelMonitor() {
        this("SystemBatteryLevelMonitor");
    }

    public SystemBatteryLevelMonitor(String identifier) {
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
        return "SystemBatteryLevelMonitor[" + identifier + "]";
    }
}
