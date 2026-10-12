package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Offset and length slice view without byte copying.
 */
public final class ZeroCopyByteBufferView {
    private final String identifier;
    private final long timestamp;

    public ZeroCopyByteBufferView() {
        this("ZeroCopyByteBufferView");
    }

    public ZeroCopyByteBufferView(String identifier) {
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
        return "ZeroCopyByteBufferView[" + identifier + "]";
    }
}
