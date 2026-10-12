package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * NMEA 0183 GPS sentence parsing utility.
 */
public final class NmeaSentenceParser {
    private final String identifier;
    private final long timestamp;

    public NmeaSentenceParser() {
        this("NmeaSentenceParser");
    }

    public NmeaSentenceParser(String identifier) {
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
        return "NmeaSentenceParser[" + identifier + "]";
    }
}
