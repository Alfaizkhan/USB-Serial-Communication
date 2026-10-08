package com.alfaizkhan.usbserialcommunication;

@FunctionalInterface
public interface SerialRxListener {
    void onBytesReceived(byte[] data, int length);
}
