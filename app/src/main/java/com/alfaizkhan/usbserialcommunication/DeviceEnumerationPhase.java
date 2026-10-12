package com.alfaizkhan.usbserialcommunication;

/**
 * USB hardware discovery and enumeration phase enum.
 */
public enum DeviceEnumerationPhase {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
