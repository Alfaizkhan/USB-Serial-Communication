package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Run-length byte sequence compression helper.
 */
public final class RunLengthEncoder {
    private final String identifier;
    private final long timestamp;

    public RunLengthEncoder() {
        this("RunLengthEncoder");
    }

    public RunLengthEncoder(String identifier) {
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
        return "RunLengthEncoder[" + identifier + "]";
    }
}
