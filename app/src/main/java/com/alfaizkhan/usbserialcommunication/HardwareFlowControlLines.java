package com.alfaizkhan.usbserialcommunication;

/**
 * RS-232 hardware handshake line enumeration.
 */
public enum HardwareFlowControlLines {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
