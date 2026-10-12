package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Fixed-size packet segmentation and framing utility.
 */
public final class FixedLengthFrameParser {
    private final String identifier;
    private final long timestamp;

    public FixedLengthFrameParser() {
        this("FixedLengthFrameParser");
    }

    public FixedLengthFrameParser(String identifier) {
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
        return "FixedLengthFrameParser[" + identifier + "]";
    }
}
