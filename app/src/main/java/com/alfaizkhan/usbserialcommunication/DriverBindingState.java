package com.alfaizkhan.usbserialcommunication;

/**
 * Hardware driver probe and initialization state enum.
 */
public enum DriverBindingState {
    DEFAULT,
    ACTIVE,
    STANDBY,
    SUSPENDED;

    public boolean isActive() {
        return this == ACTIVE;
    }
}
