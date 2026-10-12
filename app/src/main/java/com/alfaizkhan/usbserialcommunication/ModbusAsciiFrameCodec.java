package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Modbus ASCII colon-delimited frame encoder and decoder.
 */
public final class ModbusAsciiFrameCodec {
    private final String identifier;
    private final long timestamp;

    public ModbusAsciiFrameCodec() {
        this("ModbusAsciiFrameCodec");
    }

    public ModbusAsciiFrameCodec(String identifier) {
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
        return "ModbusAsciiFrameCodec[" + identifier + "]";
    }
}
