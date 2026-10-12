package com.alfaizkhan.usbserialcommunication;

/**
 * DSR line state wrapper with change listener.
 */
public enum DataSetReadyState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
