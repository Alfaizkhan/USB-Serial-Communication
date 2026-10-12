package com.alfaizkhan.usbserialcommunication;

import java.util.Objects;

/**
 * Sequential audit log of all outbound serial commands.
 */
public final class PacketAuditTrailLogger {
    private final String identifier;
    private final long timestamp;

    public PacketAuditTrailLogger() {
        this("PacketAuditTrailLogger");
    }

    public PacketAuditTrailLogger(String identifier) {
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
        return "PacketAuditTrailLogger[" + identifier + "]";
    }
}
