package com.alfaizkhan.usbserialcommunication;

/**
 * USB standard descriptor type identifier constants.
 */
public enum UsbDescriptorTypeConstant {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
