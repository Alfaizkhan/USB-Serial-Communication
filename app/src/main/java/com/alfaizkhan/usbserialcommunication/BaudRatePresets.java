package com.alfaizkhan.usbserialcommunication;

/**
 * Common standard and industrial UART baud rate definitions.
 */
public enum BaudRatePresets {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
