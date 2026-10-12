package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Byte-by-byte iterator over chunked buffers.
 */
public final class ByteBufferIterator {
    private final String identifier;
    private final long timestamp;

    public ByteBufferIterator() {
        this("ByteBufferIterator");
    }

    public ByteBufferIterator(String identifier) {
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
        return "ByteBufferIterator[" + identifier + "]";
    }
}
