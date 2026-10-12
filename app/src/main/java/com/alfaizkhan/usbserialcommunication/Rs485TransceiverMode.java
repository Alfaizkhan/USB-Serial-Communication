package com.alfaizkhan.usbserialcommunication;

/**
 * RS-485 driver enable (DE) and receiver enable (RE) mode enum.
 */
public enum Rs485TransceiverMode {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
