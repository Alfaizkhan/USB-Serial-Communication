package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Pre-configured profile for industrial Modbus RTU equipment.
 */
public final class IndustrialModbusProfile {
    private final String identifier;
    private final long timestamp;

    public IndustrialModbusProfile() {
        this("IndustrialModbusProfile");
    }

    public IndustrialModbusProfile(String identifier) {
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
        return "IndustrialModbusProfile[" + identifier + "]";
    }
}
