package com.alfaizkhan.usbserialcommunication;

/**
 * Internal and external UART loopback testing utility.
 */
public enum LoopbackModeTester {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
