package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Clock synchronization jump width parameter helper.
 */
public final class SyncJumpWidthCalculator {
    private final String identifier;
    private final long timestamp;

    public SyncJumpWidthCalculator() {
        this("SyncJumpWidthCalculator");
    }

    public SyncJumpWidthCalculator(String identifier) {
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
        return "SyncJumpWidthCalculator[" + identifier + "]";
    }
}
