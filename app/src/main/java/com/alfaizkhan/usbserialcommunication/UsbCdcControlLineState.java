package com.alfaizkhan.usbserialcommunication;

/**
 * USB CDC SetControlLineState bitmap helper.
 */
public enum UsbCdcControlLineState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
