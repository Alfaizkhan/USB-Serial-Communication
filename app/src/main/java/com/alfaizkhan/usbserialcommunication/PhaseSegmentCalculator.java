package com.alfaizkhan.usbserialcommunication;

/**
 * CAN and UART phase buffer segment sizing helper.
 */
public enum PhaseSegmentCalculator {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
