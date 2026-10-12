package com.alfaizkhan.usbserialcommunication;

/**
 * Telemetry log severity levels (TRACE, DEBUG, INFO, WARN, ERROR).
 */
public enum LogLevelConstant {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
