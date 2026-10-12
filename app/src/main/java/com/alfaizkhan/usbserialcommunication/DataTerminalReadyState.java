package com.alfaizkhan.usbserialcommunication;

/**
 * DTR line state wrapper with change listener.
 */
public enum DataTerminalReadyState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
