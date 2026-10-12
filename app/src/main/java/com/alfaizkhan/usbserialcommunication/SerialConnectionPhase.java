package com.alfaizkhan.usbserialcommunication;

/**
 * Connection phase enum (DISCONNECTED, CONNECTING, CONNECTED, DISCONNECTING).
 */
public enum SerialConnectionPhase {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
