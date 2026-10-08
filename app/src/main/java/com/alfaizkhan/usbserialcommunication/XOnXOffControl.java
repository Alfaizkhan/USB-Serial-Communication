package com.alfaizkhan.usbserialcommunication;

public class XOnXOffControl {
    private boolean transmissionPaused = false;

    public synchronized void processControlByte(byte b) {
        if (b == 0x13) {
            transmissionPaused = true;
        } else if (b == 0x11) {
            transmissionPaused = false;
        }
    }

    public synchronized boolean isPaused() {
        return transmissionPaused;
    }
}
