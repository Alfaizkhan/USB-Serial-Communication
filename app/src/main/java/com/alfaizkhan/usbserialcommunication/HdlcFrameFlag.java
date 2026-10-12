package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * HDLC standard 0x7E opening/closing delimiter constant helper.
 */
public final class HdlcFrameFlag {
    private final String identifier;
    private final long timestamp;

    public HdlcFrameFlag() {
        this("HdlcFrameFlag");
    }

    public HdlcFrameFlag(String identifier) {
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
        return "HdlcFrameFlag[" + identifier + "]";
    }
}
