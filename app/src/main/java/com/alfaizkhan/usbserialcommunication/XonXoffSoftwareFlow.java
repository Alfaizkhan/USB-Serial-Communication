package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * XON/XOFF in-band software flow control state manager.
 */
public final class XonXoffSoftwareFlow {
    private final String identifier;
    private final long timestamp;

    public XonXoffSoftwareFlow() {
        this("XonXoffSoftwareFlow");
    }

    public XonXoffSoftwareFlow(String identifier) {
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
        return "XonXoffSoftwareFlow[" + identifier + "]";
    }
}
