package com.alfaizkhan.usbserialcommunication;

/**
 * USB IN vs OUT endpoint direction resolution helper.
 */
public enum UsbEndpointDirectionHelper {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
