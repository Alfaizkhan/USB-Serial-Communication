package com.alfaizkhan.usbserialcommunication;

/**
 * Thread-safe volatile status flags for ring buffers.
 */
public enum VolatileBufferState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
