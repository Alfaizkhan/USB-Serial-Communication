package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Mask and filter matcher for incoming CAN bus IDs.
 */
public final class CanBusFrameFilter {
    private final String identifier;
    private final long timestamp;

    public CanBusFrameFilter() {
        this("CanBusFrameFilter");
    }

    public CanBusFrameFilter(String identifier) {
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
        return "CanBusFrameFilter[" + identifier + "]";
    }
}
