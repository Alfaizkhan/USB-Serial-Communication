package com.alfaizkhan.usbserialcommunication;

/**
 * 16550 UART Modem Control Register (MCR) bitmask constants.
 */
public enum ModemControlRegister {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
