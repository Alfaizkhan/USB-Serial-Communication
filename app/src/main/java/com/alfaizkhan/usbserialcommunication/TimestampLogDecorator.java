package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Millisecond and microsecond log line prefix decorator.
 */
public final class TimestampLogDecorator {
    private final String identifier;
    private final long timestamp;

    public TimestampLogDecorator() {
        this("TimestampLogDecorator");
    }

    public TimestampLogDecorator(String identifier) {
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
        return "TimestampLogDecorator[" + identifier + "]";
    }
}
