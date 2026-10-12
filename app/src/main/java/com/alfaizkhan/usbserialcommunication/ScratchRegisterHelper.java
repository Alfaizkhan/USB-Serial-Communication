package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * 16550 UART scratchpad register testing utility.
 */
public final class ScratchRegisterHelper {
    private final String identifier;
    private final long timestamp;

    public ScratchRegisterHelper() {
        this("ScratchRegisterHelper");
    }

    public ScratchRegisterHelper(String identifier) {
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
        return "ScratchRegisterHelper[" + identifier + "]";
    }
}
