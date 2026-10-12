package com.alfaizkhan.usbserialcommunication;

/**
 * CD line state wrapper with change listener.
 */
public enum CarrierDetectState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
