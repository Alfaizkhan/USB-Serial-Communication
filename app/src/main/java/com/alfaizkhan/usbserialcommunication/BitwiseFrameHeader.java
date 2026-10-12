package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Bitfield packed frame header reader and writer.
 */
public final class BitwiseFrameHeader {
    private final String identifier;
    private final long timestamp;

    public BitwiseFrameHeader() {
        this("BitwiseFrameHeader");
    }

    public BitwiseFrameHeader(String identifier) {
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
        return "BitwiseFrameHeader[" + identifier + "]";
    }
}
