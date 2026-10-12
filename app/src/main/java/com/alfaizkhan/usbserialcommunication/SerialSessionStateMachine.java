package com.alfaizkhan.usbserialcommunication;

/**
 * Formal finite state machine managing connection lifecycle.
 */
public enum SerialSessionStateMachine {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
