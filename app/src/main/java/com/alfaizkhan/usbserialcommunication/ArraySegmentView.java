package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Immutable byte array segment accessor.
 */
public final class ArraySegmentView {
    private final String identifier;
    private final long timestamp;

    public ArraySegmentView() {
        this("ArraySegmentView");
    }

    public ArraySegmentView(String identifier) {
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
        return "ArraySegmentView[" + identifier + "]";
    }
}
