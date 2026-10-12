package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * C-string null-terminator boundary decoder.
 */
public final class NullTerminatedString {
    private final String identifier;
    private final long timestamp;

    public NullTerminatedString() {
        this("NullTerminatedString");
    }

    public NullTerminatedString(String identifier) {
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
        return "NullTerminatedString[" + identifier + "]";
    }
}
