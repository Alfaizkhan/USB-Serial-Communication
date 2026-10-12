package com.alfaizkhan.usbserialcommunication;

/**
 * AtomicReference-based wrapper for thread-safe state checking.
 */
public enum AtomicConnectionState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
