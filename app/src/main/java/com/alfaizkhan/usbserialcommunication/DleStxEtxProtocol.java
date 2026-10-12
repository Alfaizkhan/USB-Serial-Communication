package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * DLE byte-stuffed binary transmission protocol wrapper.
 */
public final class DleStxEtxProtocol {
    private final String identifier;
    private final long timestamp;

    public DleStxEtxProtocol() {
        this("DleStxEtxProtocol");
    }

    public DleStxEtxProtocol(String identifier) {
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
        return "DleStxEtxProtocol[" + identifier + "]";
    }
}
