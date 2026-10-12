package com.alfaizkhan.usbserialcommunication;

/**
 * 16550 UART Modem Status Register (MSR) bitmask constants.
 */
public enum ModemStatusRegister {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
