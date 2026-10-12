package com.alfaizkhan.usbserialcommunication;

/**
 * RI line state wrapper with change listener.
 */
public enum RingDetectState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
