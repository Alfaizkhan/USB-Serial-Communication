package com.alfaizkhan.usbserialcommunication;

/**
 * CTS line state wrapper with change listener.
 */
public enum ClearToSendState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
