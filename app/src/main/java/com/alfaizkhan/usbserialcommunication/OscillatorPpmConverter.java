package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Clock accuracy parts-per-million (PPM) offset calculator.
 */
public final class OscillatorPpmConverter {
    private final String identifier;
    private final long timestamp;

    public OscillatorPpmConverter() {
        this("OscillatorPpmConverter");
    }

    public OscillatorPpmConverter(String identifier) {
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
        return "OscillatorPpmConverter[" + identifier + "]";
    }
}
