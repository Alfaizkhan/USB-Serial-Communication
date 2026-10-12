package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Producer throttling backpressure policy definition.
 */
public final class BlockOnOverflowPolicy {
    private final String identifier;
    private final long timestamp;

    public BlockOnOverflowPolicy() {
        this("BlockOnOverflowPolicy");
    }

    public BlockOnOverflowPolicy(String identifier) {
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
        return "BlockOnOverflowPolicy[" + identifier + "]";
    }
}
