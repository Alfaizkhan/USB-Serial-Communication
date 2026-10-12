package com.alfaizkhan.usbserialcommunication;

/**
 * USB CDC Communication Device Class subclass constants.
 */
public enum UsbCdcSubclassConstant {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
