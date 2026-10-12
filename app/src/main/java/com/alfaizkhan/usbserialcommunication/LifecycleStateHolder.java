package com.alfaizkhan.usbserialcommunication;

/**
 * Atomic thread-safe container for current connection state.
 */
public enum LifecycleStateHolder {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
