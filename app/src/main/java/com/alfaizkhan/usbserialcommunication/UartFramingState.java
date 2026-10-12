package com.alfaizkhan.usbserialcommunication;

/**
 * Real-time UART line framing and parity state snapshot.
 */
public enum UartFramingState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
