package com.alfaizkhan.usbserialcommunication;

public final class SerialDeviceIdentifier {
    public final String key;

    public SerialDeviceIdentifier(int vid, int pid, int deviceId) {
        this.key = String.format("USB_%04X_%04X_DEV%d", vid, pid, deviceId);
    }

    @Override
    public String toString() {
        return key;
    }
}
