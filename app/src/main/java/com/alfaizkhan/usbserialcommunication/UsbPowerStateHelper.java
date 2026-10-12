package com.alfaizkhan.usbserialcommunication;

/**
 * USB bus-powered vs self-powered status detector.
 */
public enum UsbPowerStateHelper {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
