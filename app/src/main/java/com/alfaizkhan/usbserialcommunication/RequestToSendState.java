package com.alfaizkhan.usbserialcommunication;

/**
 * RTS line state wrapper with change listener.
 */
public enum RequestToSendState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
