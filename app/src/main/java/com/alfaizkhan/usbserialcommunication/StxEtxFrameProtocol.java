package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * STX/ETX transmission framing protocol wrapper.
 */
public final class StxEtxFrameProtocol {
    private final String identifier;
    private final long timestamp;

    public StxEtxFrameProtocol() {
        this("StxEtxFrameProtocol");
    }

    public StxEtxFrameProtocol(String identifier) {
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
        return "StxEtxFrameProtocol[" + identifier + "]";
    }
}
