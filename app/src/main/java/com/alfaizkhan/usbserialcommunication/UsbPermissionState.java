package com.alfaizkhan.usbserialcommunication;

public enum UsbPermissionState {
    UNKNOWN,
    REQUESTED,
    GRANTED,
    DENIED;

    public boolean isGranted() {
        return this == GRANTED;
    }
}
