package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * CRC-16 DNP 3.0 SCADA protocol polynomial utility.
 */
public final class Crc16Dnp {
    private final String identifier;
    private final long timestamp;

    public Crc16Dnp() {
        this("Crc16Dnp");
    }

    public Crc16Dnp(String identifier) {
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
        return "Crc16Dnp[" + identifier + "]";
    }
}
