package com.alfaizkhan.usbserialcommunication;

public final class UsbDeviceMatcher {
    private UsbDeviceMatcher() {}

    public static boolean matches(int targetVid, int targetPid, int deviceVid, int devicePid) {
        if (targetVid != -1 && targetVid != deviceVid) return false;
        if (targetPid != -1 && targetPid != devicePid) return false;
        return true;
    }
}
