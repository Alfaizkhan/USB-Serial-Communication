package com.alfaizkhan.usbserialcommunication;

/**
 * Filter isolating TX-only or RX-only telemetry entries.
 */
public enum DirectionalLogFilter {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
