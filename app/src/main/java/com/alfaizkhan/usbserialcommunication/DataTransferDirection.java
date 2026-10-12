package com.alfaizkhan.usbserialcommunication;

/**
 * Telemetry transfer direction enum (INBOUND, OUTBOUND, BIDIRECTIONAL).
 */
public enum DataTransferDirection {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
