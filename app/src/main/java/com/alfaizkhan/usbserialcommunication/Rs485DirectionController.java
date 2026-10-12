package com.alfaizkhan.usbserialcommunication;

/**
 * RS-485 half-duplex Transmit/Receive direction controller.
 */
public enum Rs485DirectionController {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
